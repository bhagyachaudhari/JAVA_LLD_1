package com.example.oop.interfaceandabstracticlass;

public abstract class Product extends C implements I {

    public abstract void getOrderDetails();

    Product(){
        System.out.println("Abstract class constructor..");
    }

    Product(float price){
        System.out.println("Abstract class constructor..product price..");
    }
}
