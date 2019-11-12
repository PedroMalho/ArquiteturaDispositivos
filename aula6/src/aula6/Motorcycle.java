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
public class Motorcycle extends Vehicle {
    private String noise;

    public Motorcycle() {
       super();
       this.noise = "";
   }
     
    public Motorcycle(String noise) {
        this.noise = noise;
    }

    public Motorcycle(String noise, int year, String brand, String model, String color, double price) {
        super(year, brand, model, color, price);
        this.noise = noise;
    }

    @Override
    public String toString() {
        return super.toString() + " And the noise is " + noise + "."; //To change body of generated methods, choose Tools | Templates.
    }
    
    
     
    
}
