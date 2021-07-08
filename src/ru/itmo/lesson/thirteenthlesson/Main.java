package ru.itmo.lesson.thirteenthlesson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import ru.itmo.lesson.thirteenthlesson.dto.WikiDTO;
import ru.itmo.lesson.thirteenthlesson.listener.IListener;
import ru.itmo.lesson.thirteenthlesson.listener.WikiListener;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author chervinko <br>
 * 08.07.2021
 */
public class Main {
    private static final String BASE_URL = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите запрос для поиска:");
        String searchQuery = in.next();
        if (searchQuery == null) {
            throw new Error("Ваш запрос пуст");
        }

        String uri = BASE_URL + URLEncoder.encode(searchQuery.trim(), StandardCharsets.UTF_8);
        sendAsyncRequest(uri, WikiDTO.class, new WikiListener());
    }


    private static <T> void sendAsyncRequest(final String uri, Class<T> dtoClass, IListener<T> httpListener) {
        new Thread("request-sender") {
            @Override
            public void run() {
                try {
                    T object;
                    ObjectMapper mapper = new ObjectMapper();
                    try (CloseableHttpClient client = HttpClients.createDefault()) {
                        HttpGet request = new HttpGet(uri);
                        request.setConfig(RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build());
                        object = client.execute(request, httpResponse -> mapper.readValue(httpResponse.getEntity().getContent(), dtoClass));
                    }
                    httpListener.onSuccess(object);
                } catch (Exception exp) {
                    httpListener.onFailure();
                }
            }
        }.start();
    }
}
