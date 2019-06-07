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

}
