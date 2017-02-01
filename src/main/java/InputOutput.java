import com.sun.javafx.binding.StringFormatter;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by randallcrame on 1/31/17.
 */
public class InputOutput {
    Scanner input = new Scanner(System.in);

    public int getInputInteger(){
        return Integer.parseInt(input.next());
    }

    public String getInputString(){
        return input.next();
    }

    public String askForNumberOfPets(){
        return "How many pets do you have?";
    }

    public String askNameOfPet(){
        return "What is your pet's Name?";
    }
    public String askKindOfPet(){
        return "What kind of pet is it?";
    }

    public void petList(ArrayList<Pet> petList){
        for (Pet pet:petList) {
            System.out.printf("Name: %S\n Says: %S\n", pet.getName(),pet.speak());
        }
    }

    public void petListByName(ArrayList<Pet> petList){
        for (Pet pet:petList) {
            System.out.printf("Name: %S\n", pet.getName());
        }
    }
    public void petListByType(ArrayList<Pet> petList){
        for (Pet pet:petList) {
            System.out.printf("Type: %S\n Name: %S\n\n", pet.getClass().getSimpleName().toString(), pet.getName());
        }
    }

}
