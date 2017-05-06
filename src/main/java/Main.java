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
            System.out.println(pet.getPetName());
        }

        for(Pet pet : petList) {
            System.out.println(pet.speak());
        }

       



    }



}
