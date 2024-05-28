package org.example.models;

public class Circle {
    int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI * this.radius* this.radius;



    }


    }

