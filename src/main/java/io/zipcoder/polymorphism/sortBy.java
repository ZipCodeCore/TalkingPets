package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortBy {

    public ArrayList<Pet> sortByName(ArrayList<Pet> petList){
        Comparator<Pet> petNameComparator
                = Comparator.comparing(Pet::getName);
        Collections.sort(petList, petNameComparator);
        return petList;
    }

    public ArrayList<Pet> sortByType(ArrayList<Pet> petList){
        Comparator<Pet> petTypeComparator
                = Comparator.comparing(Pet::getType);
        Collections.sort(petList, petTypeComparator);
        return petList;
    }

}
