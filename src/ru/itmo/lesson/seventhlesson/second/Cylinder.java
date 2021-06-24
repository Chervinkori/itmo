package ru.itmo.lesson.seventhlesson.second;

/**
 * Pi * R^2 * h
 *
 * @author chervinko <br>
 * 24.06.2021
 */
public class Cylinder extends SolidOfRevolution {
    private final double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * Math.pow(radius, 2) * height, radius);
        this.height = height;
    }
}
