package humphrey.jeriah;
import java.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class InputOutput {
    Scanner input = new Scanner(System.in);
    private String prompt;
    private int userIntInput;



public int askHowManyPets(String prompt) {

    System.out.println(prompt);
    userIntInput = input.nextInt();
    return userIntInput;
}




    public void askAboutPet(String prompt) {

        System.out.println(prompt);

    }


    public void displayPets(ArrayList<Pet> pets){
             System.out.println("Number of pets: " +pets.size());
        System.out.println();
        for (Pet myPets:pets) {
            System.out.println("Pet type: " + myPets.getClass().getSimpleName());
            System.out.println("Pet Name: " + myPets.getName());
            System.out.println("Speak: " + myPets.speak());
            System.out.println();

        }

    }













}



