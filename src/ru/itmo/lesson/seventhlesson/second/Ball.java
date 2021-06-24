package ru.itmo.lesson.seventhlesson.second;

/**
 * 4/3 * Pi * R^3
 *
 * @author chervinko <br>
 * 24.06.2021
 */
public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}
