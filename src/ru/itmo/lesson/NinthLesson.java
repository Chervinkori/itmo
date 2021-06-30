package ru.itmo.lesson;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author chervinko <br>
 * 30.06.2021
 */
public class NinthLesson {

    public static void main(String[] args) {
        Integer[][] twoDimArray = {{5, 7, 3}, {7, 50, 1}, {100, 1, 2}};

        System.out.println(first(twoDimArray));
        System.out.println(second(twoDimArray));
        System.out.println(third(twoDimArray));
        Arrays.stream(fourth(5, 7)).map(Arrays::toString).forEach(System.out::println);
        System.out.println(fifth(new int[]{5, 7, 3}, new int[]{2, 3, 1}));
    }

    /**
     * 1. Написать метод для поиска наибольшего элемента в двумерном массиве
     */
    public static Integer first(Integer[][] array) {
        if (array == null)
            throw new NullPointerException();

        Integer maxValue = null;
        for (Integer[] subArray : array) {
            for (Integer item : subArray) {
                if (maxValue == null) {
                    maxValue = item;
                    continue;
                }

                if (item.compareTo(maxValue) > 0)
                    maxValue = item;
            }
        }

        return maxValue;
    }

    /**
     * 2. Написать метод, который проверяет, является ли двумерный массив квадратным.
     */
    public static boolean second(Integer[][] array) {
        if (array == null)
            throw new NullPointerException();

        for (Integer[] subArray : array) {
            if (subArray.length != array.length)
                return false;
        }

        return true;
    }

    /**
     * 3. Написать метод, который, в двумерном массиве (матрице) ищет строку, сумма
     * элементов которой является максимальной среди всех строк матрицы.
     */
    public static Integer third(Integer[][] array) {
        if (array == null)
            throw new NullPointerException();

        int sum = 0;
        Integer line = null;
        for (int i = 0; i < array.length; i++) {
            int subSum = 0;
            for (Integer item : array[i]) {
                subSum += item;
            }

            if (subSum > sum) {
                line = i;
                sum = subSum;
            }
        }

        return line;
    }

    /**
     * 4. Двумерный массив MxN заполнить случайными символами алфавита
     */
    public static char[][] fourth(int m, int n) {
        if (m <= 0 || n <= 0)
            throw new Error("Входные параметры должны быть больше \"0\"");

        Random random = new Random();
        String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";

        char[][] array = new char[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = rus.charAt(random.nextInt(rus.length()));
        }

        return array;
    }

    /**
     * 5. * Дан массив чисел numbers, и дан массив weight такой же длины. Задача: написать метод, который
     * бы случайно выбирал число из первого массива, которое есть во втором массиве.
     */
    public static int fifth(int[] numbers, int[] weight) {
        if (numbers.length != weight.length)
            throw new Error("Длинна входных массивов должна быть одинаковой");

        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (true) {
            int i = random.nextInt(numbers.length);
            set.add(i);
            for (int item : weight) {
                if (numbers[i] == item)
                    return numbers[i];
            }

            if (set.size() == numbers.length)
                throw new Error("Во входных массивах нет одинаковых элементов");
        }
    }
}
