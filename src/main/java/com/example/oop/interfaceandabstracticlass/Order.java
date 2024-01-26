package com.example.oop.interfaceandabstracticlass;

public class Order extends Product{
    @Override
    public void getOrderDetails() {
        System.out.println("Order details...");
    }

    public static void main(String[] args) {
        Order o = new Order();
        o.getOrderDetails();
        Product p = new Product(345.00F) {
            @Override
            public void getOrderDetails() {

            }
        };

        p.getOrderDetails();
    }
}
