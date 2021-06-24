package ru.itmo.lesson.seventhlesson.second;

/**
 * @author chervinko <br>
 * 24.06.2021
 */
public class SolidOfRevolution extends Shape {
    private final double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
