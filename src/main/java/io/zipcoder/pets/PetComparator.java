package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by kevinmccann on 2/1/17.
 */
public class PetComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName());
    }
}
