package com.Accounts;

import com.Bank.Client;

public class CDInvestment extends InvestmentAccount {
    private int timeFrame;
    private String timePeriod; //D = day, W = week, M = Month, Q = quarter, Y = Year

    public CDInvestment(int balance, int accountNum, Client owner, int timeFrame, String timePeriod) {
        super(balance, accountNum, owner,10 );
        this.timeFrame = timeFrame;
        this.timePeriod = timePeriod;
    }

    public void checkIfInterest(int time) {
        if (time >= timeFrame && balance > 0) {
            applyInterest();
        }
    }

    @Override
    public void withdraw(int amt) {
        return;
    }
}
