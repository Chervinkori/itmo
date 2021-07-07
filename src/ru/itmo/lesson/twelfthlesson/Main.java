package ru.itmo.lesson.twelfthlesson;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chervinko <br>
 * 07.07.2021
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        firstAndSecond();
        third();
        fourth();
    }

    /**
     * Напишите программу, в которой запускается 10 потоков и каждый из них выводит числа от 0 до 100.
     * <p>
     * Выведете состояние потока перед его запуском, после запуска и во время выполнения.
     */
    public static void firstAndSecond() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    // во время выполнения
                    System.out.println(getName() + " : " + getState());
                    for (int j = 0; j < 10; j++) {
                        System.out.println(j);
                    }
                }
            };


            // перед его запуском
            System.out.println(thread.getName() + " : " + thread.getState());

            // Запуск потока
            thread.start();

            // после запуска
            System.out.println(thread.getName() + " : " + thread.getState());
        }
    }

    /**
     * Напишите программу, в которой запускается 100 потоков, каждый из которых
     * вызывает метод increment() 1000 раз.
     * После того, как потоки завершат работу, проверьте, чему равен count .
     * Если обнаружилась проблема, предложите ее решение.
     */
    private static void third() throws InterruptedException {
        Counter counter = new Counter();
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    synchronized (counter) {
                        counter.increment();
                    }
                }
            });
            thread.start();
            threadList.add(thread);
        }

        for (Thread thread : threadList) {
            thread.join();
        }

        // Вернет некорректное значение, т.к. операция инкремента неатомарна.
        // int можно заменить на AtomicInteger (атомарный), либо синхронизировать вызов метода counter.increment()
        System.out.println(counter.getCount());
    }

    /**
     * Напишите программу, в которой создаются два потока, каждый из которых выводит
     * по очереди на консоль своё имя.
     * Начать можно с написания своего класс-потока, который выводит в бесконечном
     * цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
     * notify().
     */
    public static void fourth() {
        MyThread thread1 = new MyThread();
        thread1.start();

        MyThread thread2 = new MyThread();
        thread2.start();
    }
}
