package ru.itmo.lesson.eighthlesson.second;

/**
 * @author chervinko <br>
 * 24.06.2021
 */
abstract public class SolidOfRevolution extends Shape {
    private final double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
