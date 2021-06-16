package ru.itmo.lesson;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2й урок.
 *
 * @author chervinko <br>
 * 10.06.2021
 */
public class SecondLesson {
    /**
     * Напишите программу, которая выводит на консоль нечетные числа от 1 до 99.
     * Каждое число печатается с новой строки.
     */
    public static void first() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    /**
     * Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и
     * на то и другое (то есть и на 3 и на 5).
     */
    public static void second() {
        List<Integer> divThree = new ArrayList<>();
        List<Integer> divFive = new ArrayList<>();
        List<Integer> divThreeAndFive = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                divThreeAndFive.add(i);
            else if (i % 3 == 0)
                divThree.add(i);
            else if (i % 5 == 0)
                divFive.add(i);
        }

        System.out.println("Делится на 3: " + StringUtils.join(divThree, ", "));
        System.out.println("Делится на 5: " + StringUtils.join(divFive, ", "));
        System.out.println("Делится на 3 и на 5: " + StringUtils.join(divThreeAndFive, ", "));
    }

    /**
     * Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу.
     */
    public static boolean third() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = in.nextInt();
        System.out.print("Введите второе число: ");
        int second = in.nextInt();
        System.out.print("Введите третье число: ");
        int third = in.nextInt();

        return first + second == third;
    }

    /**
     * Напишите программу, которая принимает от пользователя три целых числа и возвращает true,
     * если второе число больше первого числа, а третье число больше второго числа.
     */
    public static boolean fourth() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = in.nextInt();
        System.out.print("Введите второе число: ");
        int second = in.nextInt();
        System.out.print("Введите третье число: ");
        int third = in.nextInt();

        return second > first && third > second;
    }

    /**
     * Напишите программу, чтобы проверить, является ли число 3 как первый или последний элемент массива целых чисел.
     * Длина массива должна быть больше или равна двум.
     */
    public static boolean fifth(int[] array) {
        return array[0] == 3 || array[array.length - 1] == 3;
    }

    /**
     * Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
     */
    public static boolean sixth(int[] array) {
        for (int item : array) {
            if (item == 1 || item == 3)
                return true;
        }

        return false;
    }
}