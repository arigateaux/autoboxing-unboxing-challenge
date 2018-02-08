package io.arigateaux;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        bank.addBranch("Virginia");

        bank.addCustomer("Virginia", "Bob", 50.00);
        bank.addCustomer("Virginia", "Jack", 13.24);
        bank.addCustomer("Virginia", "John", 223.20);

        bank.addBranch("Ohio");

    }
}
