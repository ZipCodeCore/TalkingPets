package petsPolymorphism;

import java.util.Comparator;

/**
 * Created by jennifermcginty on 5/6/17.
 */
public class ObjectOfPetComparison implements Comparator<Pet> {

    public int compare(Pet pet1, Pet o2){
        if(pet1.equals(o2.getPetType())){
            int compareNames = pet1.getPetName().compareTo(o2.getPetName());
            //System.out.println(compareNames);
            return compareNames;
        }
        else{
            return pet1.petType.compareTo(o2.getPetType());
        }

    }
}
