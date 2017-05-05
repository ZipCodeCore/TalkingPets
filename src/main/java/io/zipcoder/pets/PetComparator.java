package io.zipcoder.pets;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {

    public int compare(Pet first, Pet second) {
        int typeCheck = first.getClass().toString().compareTo(second.getClass().toString());
        if(typeCheck != 0) {
            return typeCheck;
        } else {
            return first.getName().compareTo(second.getName());
        }
    }


}
