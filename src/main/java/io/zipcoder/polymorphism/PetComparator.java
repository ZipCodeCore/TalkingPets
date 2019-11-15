package io.zipcoder.polymorphism;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {


    @Override
    public int compare(Pet o1, Pet o2) {
        // do this for remaining pets?
        if (o1.getClass().getName().compareTo(o2.getClass().getName()) == 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getClass().getName().compareTo(o2.getClass().getName());
        }
    }
}
