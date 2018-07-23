package io.zipcoder.polymorphism;
import java.util.Comparator;

public class PetComparator  implements Comparator<Pet> {


    public int compare(Pet o1, Pet o2) {
        String petName2 = o2.getName();
        String petType2 = o2.getClass().getSimpleName();


        String petName1 = o1.getName();
        String petType1 = o1.getClass().getSimpleName();

        int comparingTheTypes = petType1.compareTo(petType2);

        if (comparingTheTypes == 0) {
            int comparingTheNames = petName1.compareTo(petName2);
            return comparingTheNames;
        }


        return comparingTheTypes;
    }

}