package ru.itmo.lesson.eighthlesson.second;

/**
 * Pi * R^2 * h
 *
 * @author chervinko <br>
 * 24.06.2021
 */
public class Cylinder extends SolidOfRevolution {
    private final double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }
}
