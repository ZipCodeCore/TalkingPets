package marwamilton;

import java.util.Comparator;

/**
 * Created by mkulima on 2/1/17.
 */
public class PetComparator implements Comparator<Pet>{
    public int compare(Pet pet1, Pet pet2){
        return pet1.name.compareTo(pet2.name);
    }
}
