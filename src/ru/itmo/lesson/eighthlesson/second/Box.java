package ru.itmo.lesson.eighthlesson.second;

import java.util.ArrayList;

/**
 * @author chervinko <br>
 * 24.06.2021
 */
public class Box extends Shape {
    private double maxVolume;
    private final ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double maxVolume) {
        this.maxVolume = maxVolume;
    }

    public boolean add(Shape shape) {
        double currentValue = shape.getVolume();
        if (maxVolume < currentValue)
            return false;

        shapes.add(shape);
        maxVolume -= currentValue;

        return true;
    }

    @Override
    public double getVolume() {
        return maxVolume;
    }
}
