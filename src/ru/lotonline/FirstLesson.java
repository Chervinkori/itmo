package ru.lotonline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author chervinko <br>
 * 10.06.2021
 */
public class FirstLesson {
    /**
     * Выведите строки в следующем порядке:
     */
    private static void first() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }

    /**
     * Посчитайте результат выражения
     * (46 + 10) * (10 / 3)
     * (29) * (4) * (-15)
     */
    private static void second() {
        int first = (46 + 10) * (10 / 3);
        int second = (29) * (4) * (-15);
    }

    /**
     * В переменной number, лежит целое число 10500. В переменной result посчитайте следующее
     * выражение: (number / 10) / 10. Результат выведите на консоль.
     */
    private static void third() {
        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println(result);
    }

    /**
     * Даны три числа: 3.6, 4.1, 5.9. В переменной result посчитайте произведение этих чисел.
     */
    private static void fourth() {
        double result = 3.6 * 4.1 * 5.9;
    }

    /**
     * В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести. Каждое
     * целое число нужно печатать с новой строки. Формат ввода:
     * 42
     * 100
     * 125
     */
    private static void fifth() {
        List<Integer> params = new ArrayList<>();

        String msg = "Введите целое число: ";
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        params.add(in.nextInt());
        System.out.println(msg);
        params.add(in.nextInt());
        System.out.println(msg);
        params.add(in.nextInt());

        for (Integer param : params)
            System.out.println(param);
    }

    /**
     * Для целого числа b выполните следующие условные действия:
     * Если b нечетное, выведите “Нечетное”
     * Если b четное, выведите “Четное”
     * Если b четное и больше 100, выведите “Выход за пределы диапазона”
     * ! Использовать класс Scanner: int b = scanner.nextInt();
     */
    private static void sixth() {
        String msg = "Введите целое число: ";
        Scanner in = new Scanner(System.in);
        System.out.println(msg);

        int val = in.nextInt();
        if (val % 2 != 0)
            System.out.println("Нечетное");
        else {
            System.out.println("Четное");
            if (val > 100)
                System.out.println("Выход за пределы диапазона");
        }
    }
}