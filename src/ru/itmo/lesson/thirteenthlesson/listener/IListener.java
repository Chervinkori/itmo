package ru.itmo.lesson.thirteenthlesson.listener;

/**
 * @author chervinko <br>
 * 08.07.2021
 */
public interface IListener<T> {
    void onSuccess(T object);

    void onFailure();
}
