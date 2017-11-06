package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Create a program that asks the user how many pets they have. Once you know how many pets they have, ask them
//        what kind of pet each one is, along with each pet's name. For now your program should just hold onto the user
//        input and print out the list at the end; we'll modify this in part 3.
//

        Scanner scan = new Scanner(System.in);

        Integer numberOfPets = 0;
        ArrayList<String> typeOfPets = new ArrayList<String>();
        ArrayList<String> namesOfPets = new ArrayList<String>();

        System.out.println("How many pets do you have?");
        numberOfPets =Integer.parseInt(scan.nextLine());

        String allTypesNamed = "";

        do{
            System.out.println("What kind?");
            typeOfPets.add(scan.nextLine());

            System.out.println("What's it named?");
            namesOfPets.add(scan.nextLine());

            System.out.println("Any other pets?");
            allTypesNamed = scan.nextLine();
            }
        while(allTypesNamed.equals("y"));

        for(int i = 0; i< typeOfPets.size(); i++){
                System.out.println("a " + typeOfPets.get(i) + " named, " + namesOfPets.get(i));
            }
        }

        }



