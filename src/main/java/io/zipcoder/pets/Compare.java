package io.zipcoder.pets;

import java.util.Comparator;

public class Compare implements Comparator<Pet>{
    @Override
    public int compare(Pet o1, Pet o2) {
        if(o1.getClass().getName().compareTo(o2.getClass().getName())==0){
            return o1.getName().compareTo(o2.getName());
        }
        else{
            return o1.getClass().getName().compareTo(o2.getClass().getName());
        }
    }
}
