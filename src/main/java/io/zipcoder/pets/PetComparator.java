package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by gillianreynolds-titko on 2/1/17.
 */
public class PetComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet firstPet, Pet petToCompare){
       return firstPet.compareTo(petToCompare, 0);
    }
}
