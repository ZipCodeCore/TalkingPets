package collins.john;

import java.util.Comparator;
import java.util.List;

/**
 * Created by johncollins on 2/3/17.
 */
public class PetComparator implements Comparator<Pet> {

    public void sortByType(List<Pet> pets) {
        for (int i = 0; i < pets.size()-1 ; i++) {
            compare(pets.get(i), pets.get(i+1));

        }
    }

        public int compare (Pet o1, Pet o2){
            int result = 0;
            char firstPet = o1.getClass().getSimpleName().charAt(0);
            char secondPet = o2.getClass().getSimpleName().charAt(0);


            if (firstPet > secondPet) {
                result = 1;
            } else if (firstPet < secondPet) {
                result = -1;
            } else if (firstPet == secondPet) {
                //tie breaker by class type
                firstPet = o1.name.charAt(0);
                secondPet = o2.name.charAt(0);

                if (firstPet > secondPet) {
                    result = 1;
                } else if (firstPet < secondPet) {
                    result = -1;
                } else {
                    result = 0;
                }
            }
            return result;
        }
    }


