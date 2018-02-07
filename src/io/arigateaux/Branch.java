package io.arigateaux;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customerList = new ArrayList<Customer>();
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranch() {
        return branchName;
    }

    public void listCustomers(Customer customer) {

    }

}
