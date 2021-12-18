package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Animal {

    private double weight;
    private String color;
    private String name;

public Animal (double weight, String color,String name) {
    this.color=color;
    this.weight=weight;
    this.name=name;
}
    public String getName (Animal animal) {
        return name;
    }

    public Double getWeight (Animal animal) {
        return weight;
    }

    public void changeNameFromInput () throws FileNotFoundException {
       try { FileReader reader = new FileReader("somefile.txt");
        }
       catch (FileNotFoundException e) {
          throw e;
       }
    }
}