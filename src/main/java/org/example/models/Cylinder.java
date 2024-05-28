package org.example.models;

public class Cylinder extends Circle{
    int height;

    public Cylinder(int r , int height) {
        super(r);
        this.height = height;
    }

    public double volunme (){
        return 3.14* this. height* this.radius* this.radius;


    }

}
