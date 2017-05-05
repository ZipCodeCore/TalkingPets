package pets;

import java.util.Comparator;

/**
 * Created by cameronsima on 5/5/17.
 */
public class PetComparator implements Comparator<Pet>{
    public int compare(Pet pet1, Pet pet2) {

        if (pet1.getClass().toString().equals(pet2.getClass().toString())) {
            return pet1.getName().compareTo(pet2.getName());
        } else {
            return pet1.getClass().toString().compareTo(pet2.getClass().toString());
        }
    }
}
