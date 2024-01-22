package com.example.oop.basics;

public class Rectangle {
    // write the code of rectangle class here
    Point topLeft;
    int height;
    int width;

    int getArea(){
        return (height * width);
    }

    int getParameter(){
        return 2 * (height + width);
    }

    Point getBottomRight(){
        Point bottomRight = new Point();
        bottomRight.x = this.topLeft.x + this.width;
        bottomRight.y = this.topLeft.y - this.height;
        return bottomRight;
    }
}
