package ru.itmo;

import java.util.Random;

/**
 * Утилитарный класс.
 *
 * @author chervinko <br>
 * 16.06.2021
 */
public class Utils {

    private static final Random RANDOM = new Random();

    /**
     * Получить рандомизированный массив, заданной длинны.
     */
    public static int[] getRandomArray(int length, int minVal, int maxVal) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomInt(minVal, maxVal);
        }

        return arr;
    }

    /**
     * Получить случайное целое число в заданных пределах.
     */
    public static int getRandomInt(int min, int max) {
        return min + RANDOM.nextInt(max - min + 1);
    }

    /**
     * Удаление дублей из массива.
     */
    public static int[] clearDuplicates(int[] arr) {
        // Собирает временный массив без дублей (длинна первоначального массива)
        int[] tmpArr = new int[arr.length];
        int index = 0;
        for (int j : arr) {
            boolean contain = false;
            // Проверяем на вхождение элементов в новый массив
            for (int q : tmpArr) {
                if (q == j) {
                    contain = true;
                    break;
                }
            }
            // Если вхождений нет - добавляет в новый массив и увеличивает индекс
            if (!contain)
                tmpArr[index++] = j;
        }

        // Собирает массив без дублей (корректная длинна)
        int[] prepareArr = new int[index];
        // System.arraycopy(arrA, 0, arrB, 0, index);
        for (int i = 0; i < index; i++)
            prepareArr[i] = tmpArr[i];

        return prepareArr;
    }

    /**
     * Копия массива в рамках заданых индексов.
     */
    public static int[] arrayCopy(int[] arr, int begin, int end) {
        int[] newArr = new int[end - begin];
        int index = 0;
        for (int i = begin; i < end; i++) {
            newArr[index++] = arr[i];
        }

        return newArr;
    }

    /**
     * Сортировка слиянием.
     */
    public static int[] mergeSort(int[] arr) {
        if (arr == null)
            return null;

        if (arr.length < 2)
            return arr;

        // Делим изначальный массив пополам - левая часть
        int[] arrB = Utils.arrayCopy(arr, 0, arr.length / 2);
        // Делим изначальный массив пополам - правая часть
        int[] arrC = Utils.arrayCopy(arr, arr.length / 2, arr.length);

        // Сортируем пока не вернется по одному элементу в массиве
        arrB = mergeSort(arrB);
        arrC = mergeSort(arrC);

        return merge(arrB, arrC);
    }

    /**
     * Слияние двух массивов.
     */
    public static int[] merge(int[] arrA, int[] arrB) {
        // Массив для слияния
        int[] arrC = new int[arrA.length + arrB.length];
        // Индексы изначальных массивов
        int iA = 0, iB = 0;

        for (int i = 0; i < arrC.length; i++) {
            if (iA == arrA.length) { // Если arrA закончился - складывает в результирующий arrB
                arrC[i] = arrB[iB++];
            } else if (iB == arrB.length) { // Если arrB закончился - складывает в результирующий arrA
                arrC[i] = arrA[iA++];
            } else if (arrA[iA] < arrB[iB]) { // Если эл. из arrA меньше - складывает в результирующий и увеличивает индекс arrA
                arrC[i] = arrA[iA++];
            } else { // Если эл. из arrB меньше - складывает в результирующий и увеличивает индекс arrB
                arrC[i] = arrB[iB++];
            }
        }

        return arrC;
    }
}
