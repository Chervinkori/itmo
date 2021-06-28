package ru.itmo.lesson.eighthlesson.first;

/**
 * @author chervinko <br>
 * 28.06.2021
 */
abstract class Human {
    protected final String firstName;
    protected final String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void output();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
