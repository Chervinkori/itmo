package ru.itmo.lesson;

import ru.itmo.Utils;

import java.util.*;

/**
 * 3й урок.
 *
 * @author chervinko <br>
 * 15.06.2021
 */
public class ThirdLesson {

    /**
     * 1. Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
     * Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
     */
    public static boolean first(int[] array) {
        if (array == null || array.length == 0)
            return true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }

        return true;
    }

    /**
     * 2. Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4),
     * затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов. Пример вывода:
     * Array length: 4
     * Numbers of array:
     * 5
     * 6
     * 7
     * 2
     * Result: [5, 6, 7, 2]
     */
    public static int[] second() {
        Scanner in = new Scanner(System.in);
        System.out.print("Array length: ");
        int length = in.nextInt();
        if (length < 0)
            return new int[0];

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = in.nextInt();
        }

        return array;
    }

    /**
     * 3. Напишите метод, который меняет местами первый и последний элемент массива.
     * Пример вывода:
     * Array 1: [5, 6, 7, 2]
     * Array 2: [2, 6, 7, 5]
     */
    public static int[] third(int[] array) {
        int first = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = first;

        return array;
    }

    /**
     * 4. Дан массив чисел. Найдите первое уникальное в этом массиве число.
     * Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
     */
    public static Integer fourth(int[] array) {
        for (int item : array) {
            int count = 0;
            for (int j : array) {
                if (j == item)
                    count++;
            }

            if (count == 1)
                return item;
        }

        return null;
    }

    /**
     * 5. Вычислить N-е число Фибоначчи. Не использовать рекурсию и массивы, только циклы.
     */
    public static long fifth(int n) {
        int first = 0, second = 1, tmp;
        for (int i = 0; i < n; i++) {
            tmp = first + second;
            first = second;
            second = tmp;
        }

        return first;
    }

    /**
     * 6. Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.
     */
    public static int[] sixth() {
        int[] arr = Utils.getRandomArray(Utils.getRandomInt(5, 15), -10, 10);

        return Utils.mergeSort(arr);
    }

    /**
     * 7. Дан массив и число K. Найдите первые K самых часто встречающихся элементов.
     */
    public static void seventh(int[] arr, int k) {
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("k: " + k);

        // Массив без дублей
        int[] uniqItemArr = Utils.clearDuplicates(arr);

        // Собирает кол-во вхождений в двумерный массив
        int[][] containsArr = new int[uniqItemArr.length][2];
        for (int i = 0; i < uniqItemArr.length; i++) {
            int count = 0;
            for (int j : arr) {
                if (uniqItemArr[i] == j)
                    count++;
            }

            containsArr[i][0] = uniqItemArr[i];
            containsArr[i][1] = count;
        }

        for (; k > 0; k--) {
            int index = 0;
            int containsCount = 0;

            for (int i = 0; i < containsArr.length; i++) {
                if (containsArr[i][1] > containsCount) {
                    index = i;
                    containsCount = containsArr[i][1];
                }
            }

            System.out.println("Число " + containsArr[index][0] + ", кол-во вхождений " + containsArr[index][1]);
            //Обнуляет кол-во вхождений, чтобы не попалось повторно
            containsArr[index][1] = 0;
        }
    }
}
