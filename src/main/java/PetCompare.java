import java.util.Comparator;

/**
 * Created by danries on 2/1/17.
 */
public class PetCompare implements Comparator<Pet>{


    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet1.compareTo(pet2);
    }
}
