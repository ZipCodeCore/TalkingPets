package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by tolaniibikunle on 2/1/17.
 */
public class PetComparator implements Comparator<Pet> {
    public int compare(Pet pet1, Pet pet2) {
        return pet1.compareTo(pet2);
    }
}

