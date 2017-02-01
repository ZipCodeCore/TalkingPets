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
        int length = (pet1.getClass().getSimpleName().length() > pet2.getClass().getSimpleName().length()) ? pet1.getClass().getSimpleName().length() : pet2.getClass().getSimpleName().length();

        for(int i = 0; i < length; i++){
            if (pet1.getClass().getSimpleName().charAt(i) < pet2.getClass().getSimpleName().charAt(i)){
                return 1;
            }
            if (pet1.getClass().getSimpleName().charAt(i) > pet2.getClass().getSimpleName().charAt(i)){
                return -1;
            }
        }

        length = (pet1.getName().length() > pet2.getName().length()) ? pet1.getName().length() : pet2.getName().length();

        for(int i = 0; i < length; i++){
            if (pet1.getName().charAt(i) > pet2.getName().charAt(i)){
                return 1;
            }
            if(pet1.getName().charAt(i) < pet2.getName().charAt(i)){
                return -1;
            }
        }

        return 0;
    }

}
