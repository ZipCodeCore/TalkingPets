package io.zipcoder.pets;

import java.util.Comparator;

public class PetTypeComparator implements Comparator<Pet> {
    
    @Override
    public int compare(Pet pet1, Pet pet2) {
        String pet1Name = pet1.getName();
        String pet1Type = pet1.getClass().getSimpleName();
        String pet2Name = pet2.getName();
        String pet2Type = pet2.getClass().getSimpleName();

        int compareNames = pet1Name.compareToIgnoreCase(pet2Name);
        int compareTypes = pet1Type.compareToIgnoreCase(pet2Type);

        return compareTypes == 0 ? compareNames : compareTypes;
    }
}

    /*public static Comparator<Pet> compareByType = (a, b) -> {
        boolean ifTypeEqual = pet1.getClass().getSimpleName().equalsIgnoreCase(pet2.getClass().getSimpleName());
        int compareNames = pet1.getName().compareToIgnoreCase(pet2.getName());
        int compareTypes = pet1.getClass().getSimpleName().compareToIgnoreCase(pet2.getClass().getSimpleName());
        return ifTypeEqual ? compareNames : compareTypes;
    };*/