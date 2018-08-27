package com.LARA;

public class Ultrabook extends Laptop{
    
    //Class Variable
    
    private float thickness;
    private float batteryLife;

    //Constructor

    public Ultrabook(int ID, String brand, String model, String CPU, String RAM, String GPU, String SSD, String HDD, float price, float thickness, float batteryLife) {
        super(ID, brand, model, CPU, RAM, GPU, SSD, HDD, price);
        this.thickness = thickness;
        this.batteryLife = batteryLife;
    }

    //Getter and setter
    
    public float getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public float getbatteryLife() {
        return batteryLife;
    }

    public void setbatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}
