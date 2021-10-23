package com.company;

public class Main {

    public static void main(String[] args) {
        Account sender = new Account(200.00d, "1234567890123456");
        Account receiver = new Account(100.00d, "7890123456789012");
        sender.sendMoney(receiver, 300);
        System.out.println(sender.sum);
        System.out.println(receiver.sum);
    }
}