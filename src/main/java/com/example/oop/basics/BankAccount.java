package com.example.oop.basics;

public class BankAccount {
    // write the code of bank account class here

    String accountNumber;
    int balance;
    double roi;

    double getSimpleInterest(int time){
        return (balance * time * roi) / 100;
    }

    double getBalanceWithInterest(int time){
        return getSimpleInterest(time) + balance;
    }

}