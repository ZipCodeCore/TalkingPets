package io.zipcoder.pets;

import java.util.ArrayList;

public class Pet {

    private ArrayList<String> petsName = new ArrayList<String>();

    private String Name;

    public Pet(String name){
        this.Name = name;
    }

    public String speak(){
        String nosie = "some noise";
        return nosie;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<String> getPetsName() {
        return petsName;
    }

    public void addToPetsName(String petName){
        petsName.add(petName);
    }

}
