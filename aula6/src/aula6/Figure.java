/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import java.util.ArrayList;

/**
 *
 * @author Turma A
 */
public class Figure {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public Figure() {
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    
    public void add(Shape shape) {
        this.shapes.add(shape);
    }
    
}
