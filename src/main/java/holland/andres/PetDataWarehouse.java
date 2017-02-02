package holland.andres;

import java.util.ArrayList;

/**
 * Created by andresholland on 1/31/17.
 */
public class PetDataWarehouse {

    private int numOfPets = 0;
    private ArrayList<Pet> petsList = new ArrayList<Pet>();

    public int getNumOfPets() {
        return numOfPets;
    }

    public void setNumOfPets(int numOfPets) {
        this.numOfPets = numOfPets;
    }

    public ArrayList<Pet> getPetsList () {
        return petsList;
    }

    public void addToPetsList (Pet pet) {
        petsList.add(pet);
    }

}
