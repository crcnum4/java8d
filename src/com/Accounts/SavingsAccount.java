package com.Accounts;

public class SavingsAccount extends BankAccount implements Account {
    static int withdrawLimit = 5;
    private int withdrawCount;
    private int interest;

    public SavingsAccount(int balance, int accountNum, String owner, int interest) {
        super(balance, accountNum, owner, "Savings");
        this.withdrawCount = 5;
        this.interest = interest;
    }

    public void applyInterest() {
        deposit((int)(balance * ((float) interest / 100.0)));
    }
}
