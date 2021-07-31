package io.zipcoder.polymorphism;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    private List<Pet> pets = new ArrayList<Pet>();
    Integer numPets;

    public void numberOfPets(){
        System.out.println("How many pets do you own?");
        Integer numPets = scanner.nextInt();
        typeOfPet();
    }

    public void typeOfPet(){
        int counter = 0;
        int input;

        for (int i = 0; i < pets.size(); i++) {
            System.out.println("What type of pet(s) do you have?" + (counter + 1));
            System.out.println("1. Dog | 2. Cat | 3. Bird");
            input = scanner.nextInt();
            switch (input){
                case 1:
                    pets.add(new Dog());
                    break;
                case 2:
                    pets.add(new Cat());
                    break;
                case 3:
                    pets.add(new Bird());
                    break;

                default:
                    System.out.println("cmon bruh do it right");
                    typeOfPet();
                    break;
            }
            counter++;
        }
        nameOfPet();

    }

    public void nameOfPet() {
        int petIndex;
        String input;
        for (int i = 0; i < numPets; i++) {

            
        }
    }
}



//  if(numPets <= 1){
//          System.out.println("What is your pet's name?");
//          }else{
//          System.out.println("What are your pet's names?");
//          }
