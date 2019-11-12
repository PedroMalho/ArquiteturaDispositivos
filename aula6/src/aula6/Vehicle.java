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
public abstract class Vehicle {
    private int year;
    private String brand, model, color;
    private double price;

    public Vehicle() {
        this.year = 0;
        this.brand = "";
        this.model = "";
        this.color = "";
        this.price = 0.0;
    }

    
    
    public Vehicle(int year, String brand, String model, String color, double price) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "From the year " + year + ", the brand " + brand + ", and model " + model + ". It comes in " + color + ". All this for a price of " + price + " gold coins.";
    }

    
    
}
