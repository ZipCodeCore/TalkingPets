package marwamilton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mkulima on 1/31/17.
 */
public class PetsMain {

    public static void main(String[] args) {
        QueryUser queryUser = new QueryUser();
        PetComparator petComparator = new PetComparator();
        int numPets = queryUser.scanInt("How many pets do you have?");
        List<Pet> listOfPets = new ArrayList<Pet>(numPets);
        int counter = 1;

        // store pets in the list
        for (int i=0; i<numPets ; i++) {
            String tempName = queryUser.scanString("What is pet " + Integer.toString(i+1) + "'s name?");
            String tempTKind = queryUser.scanString("What kind of pet is pet " + Integer.toString(i+1) + " ?");
            listOfPets.add(createPet(tempTKind, tempName));
        }

        // print out pets to screen
        System.out.println("Here is your list of pets:");
        for (Pet pet : listOfPets) {
            System.out.println("\n Pet " + counter++);
            System.out.println(pet.toString());
        }

        System.out.println("Here is your list of sorted pets:");
        Collections.sort(listOfPets, petComparator);
        for (Pet pet : listOfPets) {
            System.out.println("\n Pet " + counter++);
            System.out.println(pet.toString());
        }
    }

    public static Pet createPet(String kindOfPet, String name){
        Pet tempPet;
        if(kindOfPet.equalsIgnoreCase("dog"))
            tempPet = new Dog(name);
        else if (kindOfPet.equalsIgnoreCase("cat"))
            tempPet = new Cat(name);
        else if (kindOfPet.equalsIgnoreCase("iguana"))
            tempPet = new Iguana(name);
        else
            tempPet = new Pet("abstractPet");
        return tempPet;
    }

}
