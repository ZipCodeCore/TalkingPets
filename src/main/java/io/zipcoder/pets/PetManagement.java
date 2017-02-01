package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class PetManagement implements Comparator<Pet> {
    public int numberOfPets;
    public ArrayList<Pet> pets = new ArrayList();

    @Override
    public int compare(Pet pet1, Pet pet2) {
        return 0;
    }

}
