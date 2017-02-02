package marwamilton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mkulima on 2/1/17.
 */
public class otherPetsMain {
    public static void main(String[] args) {

        PetComparator petComparator = new PetComparator();
        List<Pet> listOfPets = new ArrayList<Pet>();

        listOfPets.add( new Dog("derrtydog") );
        listOfPets.add(  new Dog("ferrtydog") );
        listOfPets.add(  new Dog("gerrtydog") );
        listOfPets.add( new Cat("catniss") );
        listOfPets.add(  new Cat("hatniss") );
        listOfPets.add(  new Dog("hatniss") );
        listOfPets.add(  new Iguana("hatniss") );

        Collections.sort(listOfPets, petComparator);
        for(Pet p : listOfPets)
            System.out.println(p.toString() + "\n");
    }
}
