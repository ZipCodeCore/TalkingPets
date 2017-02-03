package humphrey.jeriah;
import java.util.Scanner;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class Engine {
    InputOutput IO = new InputOutput();
    PetDataWareHouse house = new PetDataWareHouse();
    Scanner input = new Scanner(System.in);


    public void run() {
        house.setNumberOfPets(IO.askHowManyPets("How many pets do you want?"));
        runLoop();
        System.out.println("Here are your pets sorted by name");
        System.out.println();
        house.sortByName(house.getPetList());
        IO.displayPets(house.getPetList());
        System.out.println();
        System.out.println("Here are your pets sorted by type");
        System.out.println();
        house.sortByType(house.getPetList());
        IO.displayPets(house.getPetList());

    }


   public void runLoop(){

        for(int i =0; i <house.getNumberOfPets();i++){
            IO.askAboutPet("What type of pet do you want?");
            String petType = input.nextLine();
            IO.askAboutPet("What is your pet's name?");
            String petName= input.nextLine();
            house.addPet(petType, petName);

        }
   }

}
