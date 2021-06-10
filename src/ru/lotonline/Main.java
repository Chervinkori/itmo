package ru.lotonline;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

public class Main {
    public static void main(String[] args) {
        SecondLesson.first();
        SecondLesson.second();
        System.out.println("Результат: " + SecondLesson.third());
        System.out.println("Результат: " + SecondLesson.fourth());

        int[] array = new int[]{2, -3, 7, 1, 5, 4, 5};
        System.out.println("array: " + StringUtils.join(ArrayUtils.toObject(array), ", "));
        System.out.println(SecondLesson.fifth(array));
        System.out.println(SecondLesson.sixth(array));
    }
}