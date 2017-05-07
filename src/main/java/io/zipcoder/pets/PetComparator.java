package io.zipcoder.pets;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet>{

    public int compare(Pet p1, Pet p2) {
        if(p1.getClass().getSimpleName().equals(p2.getClass().getSimpleName()))
            return p1.getName().compareTo(p2.getName());
        else return p1.getClass().getSimpleName().compareTo(p2.getClass().getSimpleName());
    }
}
