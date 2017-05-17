import java.util.ArrayList;

/**
 * Created by andrewwong on 5/4/17.
 */
public class ListOfPets {
    private ArrayList<Pet> listOfPets = new ArrayList<>();

    public ArrayList<Pet> getListOfPets() {
        return listOfPets;
    }

    public void addPetToList(Pet pet){
        listOfPets.add(pet);
    }
}
