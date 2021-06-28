package ru.itmo.lesson.eighthlesson.first;

/**
 * @author chervinko <br>
 * 28.06.2021
 */
public class Main {
    public static void main(String[] args) {
        Human client = new Client("Roman", "Chervinko", "Sber");
        client.output();

        Human bankOfficer = new BankOfficer("Ivan", "Ivanov", "Vtb");
        bankOfficer.output();
    }
}
