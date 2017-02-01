package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class Pet implements Comparable<Pet>{

    String name;

    String speak(){ return "I am pet";}

    Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pet pet) {
        return name.compareTo(pet.getName());
    }

}
