import java.util.ArrayList;

/**
 * Created by randallcrame on 1/31/17.
 */
public class PetDataWarehouse {

    private ArrayList<Pet> petList = new ArrayList<>();
    private int numberOfPets = 0;
    private PetGenerator petGen = new PetGenerator();

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public ArrayList<Pet> getPetList() {
        return petList;
    }

    public void addPet(String name, String kind){
        Pet pet = petGen.createPet(name, kind);
        petList.add(pet);
    }

}
