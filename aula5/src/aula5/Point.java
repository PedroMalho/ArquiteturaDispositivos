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
public class Point {
    
    private double x;
    private double y;
    
    public Point(){
        x = 0.0;
        y = 0.0;
    }
    
    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }
    
    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(( other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    }
}
