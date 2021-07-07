package ru.itmo.lesson.twelfthlesson;

/**
 * @author chervinko <br>
 * 07.07.2021
 */
public class MyThread extends Thread {
    private static final Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                object.notify();
                System.out.println("Name - " + getName());
                try {
                    // Слип для наглядности вывода поочередности, иначе слишком быстро выводит
                    // Если убрать ничего не изменится
                    Thread.sleep(500);
                    object.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
