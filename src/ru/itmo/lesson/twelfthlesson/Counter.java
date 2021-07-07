package ru.itmo.lesson.twelfthlesson;

/**
 * @author chervinko <br>
 * 07.07.2021
 */
public class Counter {
    int count = 0;

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

//        AtomicInteger count = new AtomicInteger(0);
//
//        public void increment() {
//            count.incrementAndGet();
//        }
//
//        public int getCount() {
//            return count.get();
//        }
}
