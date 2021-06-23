package ru.itmo.lesson.sixthlesson;

import java.util.Calendar;

/**
 * 2. Создайте класс Дом. Добавьте в него следующие данные:
 * поля: количество этажей, год постройки, наименование;
 * метод для установки всех значений;
 * метод для вывода всех значений;
 * метод, возвращающий количество лет с момента постройки.
 * <p>
 * На основе класса создайте два объекта и пропишите для каждого характеристики. Добавление характеристик реализуйте через метод класса.
 * <p>
 * Выведите информацию про каждый объект.
 *
 * @author chervinko <br>
 * 23.06.2021
 */
public class House {
    private int numberFloors;
    private int yearConstruction;
    private String name;

    public static void main(String[] args) {
        House houseA = new House();
        houseA.setName("A");
        houseA.setNumberFloors(10);
        houseA.setYearConstruction(2015);

        House houseB = new House();
        houseB.setName("B");
        houseB.setNumberFloors(15);
        houseB.setYearConstruction(2021);

        System.out.println(houseA);
        System.out.println(houseB);
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    public int getYearConstruction() {
        return yearConstruction;
    }

    public void setYearConstruction(int yearConstruction) {
        this.yearConstruction = yearConstruction;
    }

    /**
     * Возвращает количество лет с момента постройки.
     */
    public int getYearsOld() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearConstruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberFloors=" + numberFloors +
                ", yearConstruction=" + yearConstruction +
                ", yearsOld='" + getYearsOld() + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
