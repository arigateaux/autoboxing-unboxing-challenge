package io.arigateaux;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        bank.addBranch("Virginia");

        bank.addCustomer("Virginia", "Bob", 50.00);
        bank.addCustomer("Virginia", "Jack", 13.24);
        bank.addCustomer("Virginia", "John", 223.20);

        bank.addBranch("Ohio");
        bank.addCustomer("Ohio", "Bob", 22.20);
        bank.addCustomer("Ohio", "Victor", 45.57);
        bank.addCustomer("Ohio", "Mary", 890.02);

        bank.addCustomerTransaction("Ohio", "Bob", 12.22);

        bank.listCustomers("Ohio", true);
    }
}
