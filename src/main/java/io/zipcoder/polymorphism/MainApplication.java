package io.zipcoder.polymorphism;

import io.zipcoder.pets.*;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Timothy R Rager on 11/6/17.
 */
public class MainApplication {


    public static void main(String[] args){

        int numOfPets;
        ArrayList<Pet> pets = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.print("How many pets do you have? ");
        numOfPets=in.nextInt();
        String typeOfPet = in.nextLine();//eat the newline
        String nameOfPet;

        for (int i=0; i<numOfPets; i++)
        {
            System.out.print("\nWhat kind of pet is pet number "+(i+1)+" (Dog, Cat, Snake)? ");
            typeOfPet = in.nextLine();

            System.out.print("What is your "+typeOfPet+"'s name? ");
            nameOfPet = in.nextLine();

            typeOfPet=typeOfPet.toUpperCase();
            addPetsToList(pets, typeOfPet, nameOfPet);
        }//end for

        Comparator<Pet> comp = new PetComparator();
        Collections.sort(pets, comp);

        System.out.println("\n\n");
        for (Pet p : pets){
            System.out.println(p.getName()+" speaks "+p.speak());
        }


    }

    private static void addPetsToList(ArrayList<Pet> pets, String typeOfPet, String nameOfPet) {
        switch (typeOfPet){
            case "DOG" :  {
                Pet pet = new Dog(nameOfPet);
                pets.add(pet);
                break;
            }
            case "CAT" :  {
                Pet pet = new Cat(nameOfPet);
                pets.add(pet);
                break;
            }
            case "SNAKE": {
                Pet pet = new Snake(nameOfPet);
                pets.add(pet);
                break;
            }
            default:      {
                System.out.println("We don't currently support "+typeOfPet+"s. It won't be added to the list.");
                break;
            }
        }//end switch
    }
}
