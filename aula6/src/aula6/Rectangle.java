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
public class Rectangle extends Shape {
    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle() {
        this.topLeftPoint = new Point();
        this.height = 0.0;
        this.width = 0.0;
    }

    Rectangle(Point topLeftPoint, double height, double width) {
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
       
    public boolean contains(Point a) {
        boolean contains = false;
        if (a.getX() < topLeftPoint.getX()+width && a.getX() > topLeftPoint.getX()
                && a.getY() < topLeftPoint.getY() && a.getY() > topLeftPoint.getY()-height) {
            contains = true;
        }
        return contains;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }
}
