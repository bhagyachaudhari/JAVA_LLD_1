package com.example.oop.interfaceandabstracticlass;

import java.util.ArrayList;
import java.util.Collections;

public class Car implements Comparable<Car> {

    int Price;
    int Speed;
    @Override
    public int compareTo(Car o) {
        return o.Price - this.Price;
    }

    public static void main(String[] args) {
        Car c = new Car();
        ArrayList<Car> l = new ArrayList();
        c.Price = 6;
        l.add(c);
        c = new Car();
        c.Price = 3;
        l.add(c);
        c = new Car();
        c.Price = 8;
        l.add(c);
        c = new Car();
        c.Price = 1;
        l.add(c);
        c = new Car();
        c.Price = 67;
        l.add(c);
        Collections.sort(l);
        l.forEach((o)-> System.out.println((o.Price)));

    }
}
