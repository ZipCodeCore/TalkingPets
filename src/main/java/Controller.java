import java.util.ArrayList;
import java.util.Collections;
/**
 * Created by danries on 1/31/17.
 */
public class Controller {

    Display display = new Display();
    PetManagement petManagement = new PetManagement();
    PetFactory petFactory = new PetFactory();

    public void run(){
        askUserForNumberOfPets();
        for (int i = 0; i < petManagement.numberOfPets; i++){
            askUserForPetInfo();
        }
        sortPets(petManagement.pets);
    }

    public void askUserForNumberOfPets(){
        int amount = display.askUserForInt("How many pets do you have?");
        petManagement.numberOfPets = amount;
    }

    public void askUserForPetInfo(){
        //Prompt user for info using two private methods below
        String type = askUserForPetType();
        String name = askUserForPetName();
        assignPet(petFactory.makeAPet(name, type));
    }

    private String askUserForPetName(){
        String name = display.askUserForString("What is your pets name?");
        return name;
    }

    private String askUserForPetType(){
        String type = display.askUserForString("What kind of pet do you have?");
        return type;
    }

    public void displayPets(){
        //printing individual pet
        //call displaySinglePet to display here
        for (int i = 0; i < petManagement.pets.size(); i++){
            System.out.println(displaySinglePet(petManagement.pets,i));
        }
    }

    public String displaySinglePet(ArrayList<Pet> pet, int index){
        String display = (pet.get(index)).getName() + " " + pet.get(index).speak();
        return display;
    }

    public void assignPet(Pet pet){
        petManagement.pets.add(pet);
    }

    public void sortPets(ArrayList<Pet> pets){
        Collections.sort(pets,Pet::compareTo);
    }

}
