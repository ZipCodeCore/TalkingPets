import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by mollyarant on 5/6/17.
 */
public class Main {
    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();






        petFactory.addPetsToList(petFactory.createPets());

        ArrayList<Pet> petList = petFactory.getPetList();


        Collections.sort(petList);



        for(Pet pet: petList){
            System.out.println("Print by Name");
            System.out.println(pet.getPetName());
            System.out.println(pet.getPetType());
            System.out.println(pet.speak());
            System.out.println("________________________________");
        }


        Collections.sort(petList, new ObjectofPetComparison());

        for(Pet pet1: petList){
            System.out.println("Print by Type");
            System.out.println(pet1.getPetType());
            System.out.println(pet1.getPetName());
            System.out.println(pet1.speak());
            System.out.println("_________________________________");
        }





    }



}
