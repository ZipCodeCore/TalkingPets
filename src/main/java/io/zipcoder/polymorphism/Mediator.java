package io.zipcoder.polymorphism;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.Arrays;

public class Mediator {
    ArrayList<Pet> petList = new ArrayList<Pet>();

    public void handleInput() {
        UserInput input = new UserInput();
        int numberPets = input.getNumberOfPets();
        System.out.println(numberPets);

       for (int i=0; i < numberPets; i++){
            String petType = input.getPetType(i);
            String petName = input.getPetName();
            CreatePet newPet = new CreatePet();
            newPet.createPet(petList, petType, petName);
            System.out.println( petType + " " + petName + " created");
       }
        System.out.println();
    }

    public void handleSorts() {
        sortBy mySort = new sortBy();

     //print petList sorted by Name
        System.out.println("Pets sorted by Name: ");
        for (Pet each: mySort.sortByName(petList)){
            System.out.println(each.getName());
        }
        System.out.println();

    //print petList sorted by Type
        System.out.println("Pets sorted by Type: ");
        for (Pet each: mySort.sortByType(petList)){
            System.out.println(each.getName() + " is a " + each.getType());
        }
        System.out.println();
    }

    //print what pets say
    public void petSpeak() {
        System.out.println("Pets say: ");
        for (Pet each : petList) {
            System.out.println(each.getName() + " says " + each.speak());
        }

        System.out.println();

    }
}
