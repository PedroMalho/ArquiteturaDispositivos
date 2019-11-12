/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author Turma A
 */
public class Aula6 {

    public static void main(String[] args) {
        Vehicle car = new Car(2, 1994, "Nissan", "Almera", "Branco", 2000.0);
        System.out.println(car);
        
        Vehicle bike = new Motorcycle("too high", 2000, "Honda", "CBR", "castanho", 3000.0);
        System.out.println(bike);
        
        Circle c = new Circle();
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();

        Figure fig = new Figure();
        fig.add(c);
        fig.add(t);
        fig.add(r);
    }
}
