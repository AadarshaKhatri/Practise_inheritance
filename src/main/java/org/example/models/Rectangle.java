package org.example.models;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }
    public double area(){
        return this.length*this.breadth;
    }
}
