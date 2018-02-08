package io.arigateaux;

import java.util.ArrayList;

public class Customer {

    ArrayList<Double> transactionList;
    String name;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactionList = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount) {
        this.transactionList.add(amount);
    }
}
