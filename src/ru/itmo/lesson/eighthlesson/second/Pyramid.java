package ru.itmo.lesson.eighthlesson.second;

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
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return s * h * 1 / 3;
    }
}
