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
public abstract class Shape {
    private Point position;

    public Shape() {
        this.position = new Point();
    }

    public Shape(Point position) {
        this.position = position;
    }
    
    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
}
