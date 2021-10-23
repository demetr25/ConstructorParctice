package com.company;

public class Account {
    double sum;
    String num;

    public Account(double sum, String num) {
        this.sum = sum;
        this.num = num;
    }
    public double sendMoney (Account receiver, double money) {
        if (sum>money) {
            receiver.sum+=money;
            sum-=money;
            return sum;
        }
        else {
            System.out.println("Need more money");
            return sum;
        }
    }
}
