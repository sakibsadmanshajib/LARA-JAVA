package com.LARA;

import java.io.*;
import java.util.*;

public class Main {

    public static ArrayList<Laptop> csv(String file) {

        File fileName = new File(file);

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<Laptop> laptops = new ArrayList<>();

        try {

            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {

                String[] in = line.split(cvsSplitBy);

                Laptop lp = new Laptop(Integer.parseInt(in[0]), in[1], in[2], in[3], in[4], in[5], in[6], in[7], Double.parseDouble(in[8]));
                laptops.add(lp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return laptops;

    }

    public static void main(String[] args){
        ArrayList<Laptop> lp = new ArrayList<>();
        lp = csv("Laptops.csv");

        ArrayList<Ultrabook> ult = new ArrayList<>();
        for(int i = 0; i < lp.size(); i++){
            String gpu = lp.get(i).getGPU();
            if (gpu.charAt(0) == 'i'){
                Laptop temp = lp.get(i);

                ult.add(new Ultrabook(temp.getID(), temp.getBrand(), temp.getModel(), temp.getCPU(), temp.getRAM(), temp.getGPU(), temp.getSSD(), temp.getHDD(), temp.getPrice()));
            }
        }

        ArrayList<Workstation> wor = new ArrayList<>();
        for(int i = 0; i < lp.size(); i++){
            String gpu = lp.get(i).getGPU();
            if (gpu.charAt(0) == 'd'){
                Laptop temp = lp.get(i);

                wor.add(new Workstation(temp.getID(), temp.getBrand(), temp.getModel(), temp.getCPU(), temp.getRAM(), temp.getGPU(), temp.getSSD(), temp.getHDD(), temp.getPrice()));
            }
        }


        System.out.println("                            █▀▀▀▀▀▀▀▀▀▀▀▀▀█");
        System.out.println("                            █░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█");
        System.out.println("                            █░░║║║╠─║─║─║║║║║╠─░░█");
        System.out.println("                            █░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█");
        System.out.println("                            ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");


        System.out.println("Hey there! I have already imported the Laptops from the CSV database (for your convenience)."
                            + "\nLet's help you choose the best laptop with your preferences. Please answer the questions below.");

        System.out.println("****************************************************");

        System.out.print("What is your budget? Your response: ");
        Scanner input = new Scanner(System.in);
        double budget = input.nextDouble();

        System.out.println("****************************************************");

        System.out.print("What are planning to buy? (Input the index only)" +
                "\n1. Ultrabook/Netbook (Great for office/normal use, such as Word processing, \n   web-browsing, photoshop, light-workload, optional thin&light etc.)" +
                "\n2. Gaming/Workstation (Great for Gaming, heavy-workload, video-editing, \n   3D rendering, CPU/GPU intensive task." +
                "\n3. Anyone would work just fine." +
                "\nYour choice: ");
        int preference = input.nextInt();

        System.out.println("****************************************************");

        System.out.println("Here is the list of probable laptops you might buy. Have a look!");

        System.out.println("****************************************************");

        if(preference == 1){

            for(int i = 0; i < ult.size(); i++){
                if((ult.get(i).getPrice() > (budget - 4999)) && (ult.get(i).getPrice() < (budget + 5000))){
                    System.out.println(ult.get(i).toString());
                }
            }

        }

        else if(preference == 2){

            for(int i = 0; i < wor.size(); i++){
                if((wor.get(i).getPrice() > (budget - 4999)) && (wor.get(i).getPrice() < (budget + 5000))){
                    System.out.println(wor.get(i).toString());
                }
            }

        }

        else if(preference == 3){

            for(int i = 0; i < lp.size(); i++){
                if((lp.get(i).getPrice() > (budget - 4999)) && (lp.get(i).getPrice() < (budget + 5000))){
                    System.out.println(lp.get(i).toString());
                }
            }

        }

        else
            System.out.println("Wrong Choice.");

        System.out.println("****************************************************");
    }

}
