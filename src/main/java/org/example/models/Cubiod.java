package org.example.models;

public class Cubiod extends Rectangle {
    int height;

    public Cubiod(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    @Override
    public double area(){

        return 2*(this.length * this.breadth + this.breadth * this.height + this.length * this.height);
    }
    public double Volume(){
        return this.length* this.breadth* this.height;
    }
}
