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
public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point a = new Point(3.0, 4.0);
        Point b = new Point(5.0, 6.0);
        Point c = new Point(4.0, 7.0);
        
        double dist = a.distanceTo(b);
        
        System.out.println(dist);
        
        Triangle triangulo = new Triangle(a, b, c);
        
        System.out.println("area triangle = " + triangulo.area());
    }
    
}
