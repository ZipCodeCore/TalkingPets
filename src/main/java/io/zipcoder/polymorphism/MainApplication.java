package io.zipcoder.polymorphism;

import java.util.Scanner;

import static io.zipcoder.polymorphism.Pet.name;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    //static Scanner scanner = new Scanner(System.in);




    public static void main(String[] args){


        //Pet dog = new Dog();
        Pet cat = new Cat();
        System.out.println("Cats name is: "+ name +"\nand cats go " +cat.speak());
        //System.out.println("Dogs name is "+ name +"\n and dogs go " + dog.speak());

    }
}
