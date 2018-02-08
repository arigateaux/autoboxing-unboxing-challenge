package io.arigateaux;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branchList = new ArrayList<Branch>();
    private Branch branch;

    public void addBranch(String branchName) {
        if (branchExists(branchName)) {
            System.out.println(branchName + " already exists!");
        }
        else {
            this.branch = new Branch(branchName);
            branchList.add(this.branch);
            System.out.println(this.branch + " added to the bank network!");
        }
    }

    private boolean branchExists(String branchName) {
        for (int i = 0; i < branchList.size(); i++) {
            String findBranch = branchList.get(i).getBranch();
            if (branchName.equals(findBranch)) {
                return true;
            }
        }
        return false;
    }

}
