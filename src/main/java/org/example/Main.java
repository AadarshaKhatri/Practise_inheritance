package org.example;


import org.example.models.Circle;
import org.example.models.Cubiod;
import org.example.models.Cylinder;
import org.example.models.Rectangle;

public class Main {
    public static void main(String[] args) {
         // For Cylinder and Circle
        Circle c = new Circle(4);
        System.out.println(c.area());
        Cylinder cy = new Cylinder(6,8);
        System.out.println(cy.area());;
        System.out.println(cy.volunme());

        // For Rectangle and Cuboid
        Rectangle r = new Rectangle(3,4);
        System.out.println(r.area());
        Cubiod cu = new Cubiod(1,2,3);
        System.out.println(cu.area());
        System.out.println(cu.Volume());
    }


}