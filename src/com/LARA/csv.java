package com.LARA;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class csv {
    private static String filePath;
    public csv (String filePath) {
        this.filePath = filePath;

    }

    public ArrayList<Laptop> getLaptopFromCsv() throws IOException {

        File file = new File("Laptop.csv");
        ArrayList<Laptop> list = new ArrayList<>();

        try (Scanner inputStream = new Scanner(file)) {

            while(inputStream.hasNext()){

                String[] nextRecord = inputStream.next().split(",");

                Laptop laptop = null;

                for (int n=0; n < 9; ++n) {

                    int id = Integer.parseInt(nextRecord[0]);
                    String brand= nextRecord[1];
                    String model= nextRecord[2];
                    String cpu= nextRecord[3];
                    String ram= nextRecord[4];
                    String gpu= nextRecord[5];
                    String ssd= nextRecord[6];
                    String hdd= nextRecord[7];
                    double price= Double.parseDouble(nextRecord[8]);

                    laptop = new Laptop(id, brand, model, cpu, ram, gpu, ssd, hdd, price);
                }

                list.add(laptop);

            }
        }

        return list;

    }

}

