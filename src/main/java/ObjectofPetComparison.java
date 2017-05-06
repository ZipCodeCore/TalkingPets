import java.util.Comparator;

/**
 * Created by mollyarant on 5/6/17.
 */
public class ObjectofPetComparison implements Comparator<Pet> {


    public int compare(Pet pet1, Pet o2) {
        if (pet1.petType.equals(o2.getPetType())) {
            int compareName = pet1.getPetName().compareTo(o2.getPetName());
            return compareName;
        } else {
            return pet1.petType.compareTo(o2.getPetType());
        }

    }
}
