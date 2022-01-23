package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dog extends Animal implements AnimalBehaviour {

    private String breed;
    private String[] medals;

    public Dog(double weight, String color, String name, String breed) {
        super(weight, color, name);
        this.breed = breed;
        this.medals=null;
    }

    @Override
    public String eatFood(String foodType) throws IllegalCallerException {

        if (foodType != "dogfood") {
            throw new IllegalCallerException("Wrong food type");
        } else {
            return "Dog is fed";
        }

    }

    public double changeWeight(String newWeight) {
        try {
            return Double.parseDouble(newWeight);
        } catch (NumberFormatException e) {
            System.out.println("Haven't change the weight. Returning current value.");
            return this.getWeight(this);

        }
    }

    public void giveMedals (String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                System.out.println("Added medal: "+ scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}