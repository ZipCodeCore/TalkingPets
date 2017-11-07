package io.zipcoder.pets;

import java.util.ArrayList;

public class Pet {
    private String Name;

    private static ArrayList<String> petsNameArray = new ArrayList<String>();

    private static ArrayList<Pet> petsArray = new ArrayList<Pet>();

    public Pet(String name){

        this.Name = name;
    }

    public String getPetsName() {
        String animal = "";
        for(String animals: petsNameArray) {
            animal += animals;
        }
        return animal;
    }

    public void addToPetArray(Pet pet){
        petsArray.add(pet);
    }

    public static String getPetsInArray(){
        String animal = "";
        for(Pet animals: petsArray){
            animal += animals.Name + "--" + String.valueOf(animals.getClass()).replace("class io.zipcoder.pets.", "") + "\n";
        }
        return animal;
    }

    public void addToPetsNameArray(String petName){
        petsNameArray.add(petName);
    }

    public String speak(){
        return "some noise";
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


}
