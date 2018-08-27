package com.LARA;

public class Laptop {

    //Class Variables

    private int ID;
    private String brand;
    private String model;
    private String CPU;
    private String RAM;
    private String GPU;
    private String SSD;
    private String HDD;
    private double price;

    //Constructor

    public Laptop(int ID, String brand, String model, String CPU, String RAM, String GPU, String SSD, String HDD, double price) {
        this.ID = ID;
        this.brand = brand;
        this.model = model;
        this.CPU = CPU;
        this.RAM = RAM;
        this.GPU = GPU;
        this.SSD = SSD;
        this.HDD = HDD;
        this.price = price;
    }

    //Getter and setter

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ID=" + ID +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", GPU='" + GPU + '\'' +
                ", SSD='" + SSD + '\'' +
                ", HDD='" + HDD + '\'' +
                ", price=" + price +
                '}';
    }
}

