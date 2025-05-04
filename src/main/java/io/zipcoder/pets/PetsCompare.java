package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by prestonbattin on 2/1/17.
 */
public class PetsCompare implements Comparator<Pet>{


    public int compare(Pet a, Pet b){

        if(a.compareTo(b) == 0){
           return compareType(a, b);
        }
        else
            return a.compareTo(b);
    }

    public int compareType(Pet a, Pet b){

        if(a.getType().equals(b.getType()))
            return 0;
        else if(a.getType().compareTo(b.getType()) < 0)
            return -1;
        else
            return 1;
    }


}
