package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by prestonbattin on 1/30/17.
 */
public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<Pet> listOfPets = new ArrayList<>();
        Output output = new Output();
        PetsCompare compare = new PetsCompare();

        System.out.println("How many pets do you have?");

        output.setNumPets(sc.nextInt());

        for (int i = 0; i < output.getNumPets(); i++) {
            output.getPetTypesMenu(i);

            output.getPetNamesMenu(i);

            listOfPets.add(output.getPet());
        }

        System.out.println("Your pets: ");

         Collections.sort( listOfPets, compare  );
        for (int i = 0; i < output.getNumPets(); i++) {

            System.out.println(listOfPets.get(i).getType() + " named " +
                    listOfPets.get(i).getName());
        }
    }
}

