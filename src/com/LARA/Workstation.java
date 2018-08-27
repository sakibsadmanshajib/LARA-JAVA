package com.LARA;

public class Workstation extends Laptop{

    //Class variable

    private float weight;
    private float thickness;

    //Constructor

    public Workstation(int ID, String brand, String model, String CPU, String RAM, String GPU, String SSD, String HDD, float price, float weight, float thickness) {
        super(ID, brand, model, CPU, RAM, GPU, SSD, HDD, price);
        this.weight = weight;
        this.thickness = thickness;
    }

    //Getter and setter

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }
}
