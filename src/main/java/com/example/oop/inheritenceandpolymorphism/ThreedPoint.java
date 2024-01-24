package com.example.oop.inheritenceandpolymorphism;

public class ThreedPoint extends Point{
    private int z;

    public void display(){
        System.out.println("["+x+", "+y+", "+z+"]");
    }

    public static void main(String[] args) {
        ThreedPoint tp = new ThreedPoint();
        tp.display();
        Point p = new ThreedPoint();
        p.display();
        Point p1 = new Point();
        p1.display();
    }
}
