package petsPolymorphism;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jennifermcginty on 5/6/17.
 */
public class Main {
    public static void main(String [] args){


        PetFactory petFactory = new PetFactory();

        petFactory.addPetsToList(petFactory.createPets());

        ArrayList<Pet> petList = petFactory.getPetList();

        Collections.sort(petList);

        Collections.sort(petList, new ObjectOfPetComparison());


        for(Pet pet : petFactory.getPetList()) {
            System.out.println(" ");
            System.out.println(pet.getPetName());
            System.out.println(pet.getPetType());
            System.out.println(pet.speak());
            System.out.println(" ");
        }



    }


}
