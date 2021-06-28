package ru.itmo.lesson.seventhlesson.second;

/**
 * @author chervinko <br>
 * 28.06.2021
 */
public class Main {
    public static void main(String[] args) {
        Box box = new Box(500);

        System.out.println(box.add(new Cylinder(2.5, 2.5)));
        System.out.println(box.add(new Ball(3.5)));
        System.out.println(box.add(new Pyramid(50, 50)));
    }
}
