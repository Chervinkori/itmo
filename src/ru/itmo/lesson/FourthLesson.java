package ru.itmo.lesson;

import org.apache.commons.lang.StringUtils;

/**
 * 4й урок.
 *
 * @author chervinko <br>
 * 16.06.2021
 */
public class FourthLesson {
    /**
     * Написать метод для поиска самой длинной строки.
     */
    public static String first(String... strings) {
        String maxString = StringUtils.EMPTY;
        for (String str : strings) {
            if (str == null)
                continue;

            if (str.length() > maxString.length())
                maxString = str;
        }

        return maxString;
    }

    /**
     * Написать метод, который проверяет является ли слово палиндромом.
     */
    public static boolean second(String str) {
        if (str == null || str.length() <= 1)
            return true;

        return str.equals(new StringBuilder(str).reverse().toString());
    }

    /**
     * Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
     */
    public static String third(String str) {
        if (str == null)
            return StringUtils.EMPTY;

        return str.replaceAll("бяка", "[вырезано цензурой]");
    }

    /**
     * Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
     */
    public static int fourth(String first, String second) {
        // Не забываем обработать деление на "0"
        if (first == null || second == null || second.length() == 0)
            return 0;

        return (first.length() - first.replace(second, "").length()) / second.length();
    }

    /**
     * Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания,
     * и слова разделены пробелами.
     * Sample Output:
     * The given string is: This is a test string
     * The string reversed word by word is:
     * sihT si a tset gnirts
     */
    public static String fifth(String str) {
        if (str == null || str.length() == 0)
            return StringUtils.EMPTY;

        StringBuilder sb = new StringBuilder();
        for (String item : str.split(" ")) {
            sb.append(new StringBuilder(item).reverse()).append(" ");
        }

        return sb.toString().trim();
    }

    public static String[] bubbleSort(String[] str) {
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < str.length - 1; i++) {
                if (str[i].compareTo(str[i + 1]) > 0) {
                    String tmp = str[i];
                    str[i] = str[i + 1];
                    str[i + 1] = tmp;
                    flag = false;
                }
            }
        }

        return str;
    }
}
