package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here


        //throw exception
        System.out.println("--------------------------Throw and catch exception---------------------------------");
        String catFoodType = "catfood";
        String dogFoodTYpe = "dogfood";
        Dog sharik = new Dog(10.2, "black", "Шарик", "nobreed");
        try {
            System.out.println(sharik.eatFood(catFoodType));
        } catch (IllegalCallerException e) {
            System.err.println(e.getMessage());
            System.err.println("Exception occured");
        } finally {
            System.out.println("You tried to feed " + sharik.getName(sharik) + " with " + catFoodType);
        }

        System.out.println("\n"+"-------------------------Rethrow exception----------------------------------");
        //rethrow exception

        try {
            sharik.changeNameFromInput();
            System.out.println("Name has changed\n"+"New name: "+sharik.getName(sharik));
        } catch (FileNotFoundException e) {
            System.err.println("Something went wrong while changing the name of your pet");
            System.err.println(e.getMessage());
        }


        System.out.println("\n"+"-------------------------Default value----------------------------------");
        //returning default value

        System.out.println(sharik.changeWeight("dfv dsg"));

        System.out.println("\n"+"-------------------------try-with-resources----------------------------------");
        //returning default value
        sharik.giveMedals("./src/com/company/Medals.txt");


    }
}