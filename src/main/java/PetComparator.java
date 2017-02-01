import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by randallcrame on 2/1/17.
 */
public class PetComparator  implements Comparator<Pet> {

    public int compare(Pet pet, Pet pet2){
        return pet.getClass().toString().compareTo(pet2.getClass().toString());
    }

    public void sortByName(ArrayList<Pet> petList){
        if (!(petList.size() == 0))
            Collections.sort(petList);
    }

    public void sortByType(ArrayList<Pet> petList){
        if (!(petList.size() == 0))
            Collections.sort(petList, new PetComparator());
    }

}
