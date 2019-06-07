package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Output {
    sortBy mySort = new sortBy();

    // method to print petList sorted by Name
    public void listSortedByName(ArrayList<Pet> petList){
        System.out.println("Pets sorted by Name: ");
        for (Pet each: mySort.sortByName(petList)){
            System.out.println(each.getName());
        }
        System.out.println();
    }

    //method to print petList sorted by Type
    public void listSortedByType(ArrayList<Pet> petList){
        System.out.println("Pets sorted by Type: ");
        for (Pet each: mySort.sortByType(petList)){
            System.out.println(each.getName() + " is a " + each.getType());
        }
        System.out.println();
    }

    //method to print what pets say
    public void petSpeak(ArrayList<Pet> petList) {
        System.out.println("Pets say: ");
        for (Pet each : petList) {
            System.out.println(each.getName() + " says " + each.speak());
        }
        System.out.println();
    }

}
