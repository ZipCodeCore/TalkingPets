/**
 * Created by mollyarant on 5/6/17.
 */
public class Main {
    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();





        petFactory.addPetsToList(petFactory.createPets());

        for(Pet pet : petFactory.getPetList()) {
            System.out.println(pet.speak());
        }

    }



}
