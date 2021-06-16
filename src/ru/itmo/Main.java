package ru.itmo;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import ru.itmo.lesson.SecondLesson;
import ru.itmo.lesson.ThirdLesson;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        thirdLesson();
    }

    /**
     * 2-й урок
     */
    private static void secondLesson() {
        SecondLesson.first();
        SecondLesson.second();
        System.out.println("Результат: " + SecondLesson.third());
        System.out.println("Результат: " + SecondLesson.fourth());

        int[] array = new int[]{2, -3, 7, 1, 5, 4, 5};
        System.out.println("array: " + StringUtils.join(ArrayUtils.toObject(array), ", "));
        System.out.println(SecondLesson.fifth(array));
        System.out.println(SecondLesson.sixth(array));
    }

    /**
     * 3-й урок
     */
    private static void thirdLesson() {
        System.out.println(ThirdLesson.first(new int[]{1, 2, 3, 1}) ? "OK" : "Please, try again");
        System.out.println("Result: " + Arrays.toString(ThirdLesson.second()));
        System.out.println("Result: " + Arrays.toString(ThirdLesson.third(new int[]{1, 2, 3, 4})));
        System.out.println(ThirdLesson.fourth(new int[]{1, 2, 3, 1, 2, 4}));
        System.out.println(ThirdLesson.fifth(20));
        System.out.println(Arrays.toString(ThirdLesson.sixth()));
        ThirdLesson.seventh(Utils.getRandomArray(Utils.getRandomInt(5, 20), -10, 10), 5);
    }
}