package io.arigateaux;

import java.util.ArrayList;

public class Customer {

    ArrayList<Double> transactionList = new ArrayList<Double>();
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }

    public String getName() {
        return name;
    }

    public void listTransactions(Customer customer) {

    }
}
