package ru.itmo.lesson;

import org.apache.commons.lang.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 14 урок
 *
 * @author chervinko <br>
 * 12.07.2021
 */
public class FourteenthLesson {
    public static void main(String[] args) {
        first2lesson();
        second2lesson();
        System.out.println(sixth2lesson(new int[]{2, -3, 7, -1, 5, 4, 5}));
        System.out.println(first4lesson("123", "1234", "123456", "12345"));
        System.out.println(third4lesson("бука бяка забияка"));
    }

    /**
     * 1е задание 2го урока.
     * Напишите программу, которая выводит на консоль нечетные числа от 1 до 99.
     * Каждое число печатается с новой строки.
     */
    public static void first2lesson() {
        IntStream.rangeClosed(1, 99).forEach(System.out::println);
    }

    /**
     * 2е задание 2го урока.
     * Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и
     * на то и другое (то есть и на 3 и на 5).
     */
    public static void second2lesson() {
        System.out.print("Делится на 3: ");
        System.out.println(Arrays.toString(IntStream.rangeClosed(1, 100).filter(i -> i % 3 == 0).toArray()));

        System.out.print("Делится на 5: ");
        System.out.println(Arrays.toString(IntStream.rangeClosed(1, 100).filter(i -> i % 5 == 0).toArray()));

        System.out.print("Делится на 3 и на 5: ");
        System.out.println(Arrays.toString(IntStream.rangeClosed(1, 100).filter(i -> i % 3 == 0 && i % 5 == 0).toArray()));
    }

    /**
     * 6е задание 2го урока.
     * Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
     */
    public static boolean sixth2lesson(int[] array) {
        return Arrays.stream(array).anyMatch(item -> item == 1 || item == 3);
    }

    /**
     * 1е задание 4го урока.
     * Написать метод для поиска самой длинной строки.
     */
    public static String first4lesson(String... strings) {
        if (strings == null || strings.length == 0) {
            return null;
        }

        return List.of(strings).stream().max(Comparator.comparing(String::length)).get();
    }

    /**
     * 2е задание 4го урока.
     * Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
     */
    public static String third4lesson(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }

        return Arrays.stream(str.split(" ")).filter(s -> !s.equals("бяка")).collect(Collectors.joining(" "));
    }
}
