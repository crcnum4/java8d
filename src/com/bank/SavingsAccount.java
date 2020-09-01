package com.bank;

public class SavingsAccount extends BankAccount {
    static int withdrawLimit = 5;
    private int withdrawCount;
    private int interest;

    public SavingsAccount(int balance, int accountNum, String owner, int interest) {
        super(balance, accountNum, owner, "Savings");
        this.withdrawCount = 5;
        this.interest = interest;
    }

    public void applyInterest() {
        balance += balance * ((float) interest / 100.0);
    }
}
