package ru.itmo.lesson.seventhlesson.second;

/**
 * 1/3 * S * h
 *
 * @author chervinko <br>
 * 24.06.2021
 */
public class Pyramid extends Shape {
    public final double s;
    public final double h;

    public Pyramid(double s, double h) {
        super(s * h * 1 / 3);
        this.s = s;
        this.h = h;
    }
}
