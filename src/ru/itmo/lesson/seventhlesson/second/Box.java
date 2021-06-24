package ru.itmo.lesson.seventhlesson.second;

import java.util.ArrayList;

/**
 * @author chervinko <br>
 * 24.06.2021
 */
public class Box extends Shape {
    private double maxVolume;
    private final ArrayList<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {

        Box box = new Box(500);

        System.out.println(box.add(new Cylinder(2.5, 2.5)));
        System.out.println(box.add(new Ball(3.5)));
        System.out.println(box.add(new Pyramid(50, 50)));
    }

    public Box(double maxVolume) {
        super(maxVolume);
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
}
