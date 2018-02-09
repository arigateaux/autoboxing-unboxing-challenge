package io.arigateaux;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branchList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchList = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branchList.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, initialAmount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branchList.size(); i++) {
            Branch branch = this.branchList.get(i);
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomerList = branch.getCustomerList();
            for (int i = 0; i <= branchList.size(); i++) {
                Customer branchCustomer = branchCustomerList.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");
                if (showTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> customerTransactionList = branchCustomer.getTransactionList();
                    for (int j = 0; j < customerTransactionList.size(); j++) {
                        System.out.println("[" + (j + 1) + "]  Amount: " + customerTransactionList.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}
