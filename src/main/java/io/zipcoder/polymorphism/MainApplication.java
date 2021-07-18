package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    ArrayList <Pet> petList = new ArrayList<>();
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("How many pets do you have?");
//    }

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

    public int getSize() {
        return petList.size();
    }
}
