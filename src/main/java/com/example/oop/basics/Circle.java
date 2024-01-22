package com.example.oop.basics;

public class Circle {
    // write the code of circle class here
    Point center;
    int radius;
    double pi = Math.PI;


    double getArea(){
        return pi * radius * radius;
    }

    double getParameter(){
        return 2 * pi * radius;
    }

    boolean isOverlapping(Circle c){
        int d = (int) Math.sqrt(Math.pow(c.center.x - this.center.x, 2) + (Math.pow(c.center.y - this.center.y, 2)));
        if ( d <= this.radius)
            return true;

        return false;
    }

}

