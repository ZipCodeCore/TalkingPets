package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class PetManagement implements Comparator<Pet> {

    public int numberOfPets = 0;
    //public PetFactory aPetFactory;
    public ArrayList<Pet> pets = new ArrayList<Pet>();

    public int compare(Pet pet, Pet petToCompare){
        return 0;
    }

    public boolean equals(Pet pet){
        return false;
    }

}
