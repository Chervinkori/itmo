package ru.itmo.lesson.sixthlesson;

/**
 * Создайте класс Tree. Добавьте в него поля: возраст, живое ли дерево и название дерева. Создайте три конструктора:
 * Конструктор, который устанавливает только возраст и название;
 * Конструктор, который устанавливает все переменные в классе;
 * Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».
 * <p>
 * Создайте три объекта на основе класса и используйте по одному конструктору на каждый.
 *
 * @author chervinko <br>
 * 23.06.2021
 */
public class Tree {
    private int age;
    private boolean alive;
    private String name;

    public static void main(String[] args) {
        Tree treeA = new Tree();
        Tree treeB = new Tree(500, "Oak");
        Tree treeC = new Tree(50, true, "Birch");

        System.out.println(treeA);
        System.out.println(treeB);
        System.out.println(treeC);
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", alive=" + alive +
                ", name='" + name + '\'' +
                '}';
    }
}
