package ru.itmo.lesson.eighthlesson.second;

/**
 * 4/3 * Pi * R^3
 *
 * @author chervinko <br>
 * 24.06.2021
 */
public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 3) * 4 / 3;
    }
}
