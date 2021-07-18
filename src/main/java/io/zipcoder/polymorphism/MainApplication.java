package io.zipcoder.polymorphism;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    ArrayList <Pet> petList = new ArrayList<>();
    public static void main(String[] args) {
        MainApplication app = new MainApplication();
        Scanner in = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int value = in.nextInt();
        while (value > 0) {
            System.out.println("Is it a dog, cat, parrot, or other");
            String type = in.next().toLowerCase();
            switch (type){
                case "dog":
                    System.out.println("What's your dog's name?");
                    String name = in.next();
                    app.addDog(name);
                    System.out.println("Next pet...");
                    break;
                case "cat":
                    System.out.println("What's your cat's name?");
                    String catName = in.next();
                    app.addCat(catName);
                    System.out.println("Next pet...");
                    break;
                case "parrot":
                    System.out.println("What's your parrot's name");
                    String birdName = in.next();
                    app.addParrot(birdName);
                    System.out.println("Next pet...");
                    break;
                default:
                    System.out.println("Name it");
                    String petName = in.next();
                    app.addPet(petName);
                    System.out.println("Next pet...");
                    break;
            }
            value--;

        }
        System.out.println(app.printListWithSound());
    }

    public int getValue(String input){
        return Integer.parseInt(input);
    }

    public String printList(){
        StringBuilder print = new StringBuilder();
        for (Pet pet : petList) {
            print.append(pet.getName());
            print.append("\n");
        }
        return print.toString();
    }

    public void addPet(String name){
        Pet pet = new Pet(name);
        petList.add(pet);

    }

    public void addDog(String name){
        Pet pet = new Dog(name);
        petList.add(pet);

    }

    public void addCat(String name){
        Pet pet = new Cat(name);
        petList.add(pet);

    }

    public void addParrot(String name){
        Pet pet = new Parrot(name);
        petList.add(pet);

    }

    public int getSize() {
        return petList.size();
    }

    public String printListWithSound(){
        StringBuilder print = new StringBuilder();
        for (Pet pet : petList) {
            print.append(pet.getName());
            print.append(" goes ");
            print.append(pet.speak());
            print.append("\n");
        }
        return print.toString();
    }
}
