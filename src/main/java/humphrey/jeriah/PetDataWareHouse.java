package humphrey.jeriah;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class PetDataWareHouse {
    private ArrayList<Pet> petList = new ArrayList<Pet>();
    private int numberOfPets;
    private PetGenerator petgen = new PetGenerator();
    Scanner input = new Scanner(System.in);


    public ArrayList<Pet> getPetList(){

        return petList;
    }

    public Pet getPet(Pet p){
        return p;

    }

    public void setNumberOfPets(int number){
        numberOfPets = number;
    }

    public int getNumberOfPets(){
        return  numberOfPets;
    }



    public void addPet(String petType, String petName){
        switch (petType.toUpperCase()) {
            case "DOG":
                petList.add(petgen.createDog(petName));
                break;
            case "CAT":
                petList.add(petgen.createCat(petName));
                break;
            case "DINO":
                petList.add(petgen.createDino(petName));
                break;

            default:
                System.out.println("Not a valid Pet. Please input a valid Pet type and Name");
                String newType = input.nextLine();
                String newName = input.nextLine();
                addPet(newType, newName);


        }

        }



    }








