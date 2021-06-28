package ru.itmo.lesson.eighthlesson.first;

/**
 * @author chervinko <br>
 * 28.06.2021
 */
public class BankOfficer extends Human {
    private final String bankName;

    public BankOfficer(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "BankOfficer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getBankName() {
        return bankName;
    }
}
