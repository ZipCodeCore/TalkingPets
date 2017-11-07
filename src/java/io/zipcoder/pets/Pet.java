package io.zipcoder.pets;
import java.util.ArrayList;
import java.util.Comparator;

public class Pet implements Comparable<Pet> {
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
            animal += animals.Name + " the " + animals.getClass().getSimpleName() +
                    " goes " + animals.speak() + "\n";
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

    @Override
    public int compareTo(Pet otherPet) {
        int compareName = this.Name.compareTo(otherPet.Name);
        int compareSpecies = this.getClass().getSimpleName().compareTo(otherPet.getClass().getSimpleName());
        int returnedInt = compareName == 0 ?  compareSpecies : compareName;
        //if names are equal then compare by species
        return returnedInt;
    }
}
