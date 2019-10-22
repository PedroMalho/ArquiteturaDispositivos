/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author Turma A
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    
    public Triangle() {
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }
    
    public Point getA() {
        return a;
    }
    
    public Point getB() {
        return b;
    }
    
    public Point getC() {
        return c;
    }
    
    public void setA(Point a) {
        this.a = a;
    }
    
    public void setB(Point b) {
        this.b = b;
    }
    
    public void setC(Point c) {
        this.c = c;
    }
    
    public Triangle(final Point a, final Point b, final Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void setABC(Point a, Point b, Point c) {
        setA(a);
        setB(b);
        setC(c);
    }
    
    public double base() {
        return b.distanceTo(c);
    }
    
    public double height() {
        return a.distanceTo(b);
    }
    
    public double area() {
        return ((base() * height()) / 2);
    }
}
