package ru.itmo.lesson.thirteenthlesson.listener;

import ru.itmo.lesson.thirteenthlesson.dto.WikiDTO;

import java.util.List;

/**
 * @author chervinko <br>
 * 08.07.2021
 */
public class WikiListener implements IListener<WikiDTO> {
    @Override
    public void onSuccess(WikiDTO object) {
        List<WikiDTO.Search> searchList = object.query.search;
        for (WikiDTO.Search search : searchList) {
            System.out.println("Заголовок: " + search.title);
            System.out.println("Краткое описание: " + search.snippet + "\n");
        }
    }

    @Override
    public void onFailure() {
        System.out.println("Ошибка выполнения запроса");
    }
}
