/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import aula5.Point;

/**
 *
 * @author Turma A
 */
public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius, Point position) {
        super(position);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
    
}
