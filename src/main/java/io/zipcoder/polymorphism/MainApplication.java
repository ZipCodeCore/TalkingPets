package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 11/6/17.
 */

public class MainApplication {
    public static void main(String[] args){
        Boolean turnOn = true;

        while(turnOn){

            Integer input = Console.getIntegerInput("\nHow many pets do you have?\n");
            ArrayList<Pet> petsLog = new ArrayList<Pet>();

            if(input > 0){
                for(int i = 0; i < input; i++){
                    String petValue = Console.getStringInput("What kind of animal is pet #" + (i + 1) + "?");
                    String nameValue = Console.getStringInput("What is your pet's name?");
                    switch (petValue){
                        case ("dog"):
                            Dog dog = new Dog(nameValue);
                            petsLog.add(dog);
                            break;
                        case ("cat"):
                            Cat cat = new Cat(nameValue);
                            petsLog.add(cat);
                            break;
                        case ("bird"):
                            Bird bird = new Bird(nameValue);
                            petsLog.add(bird);
                            break;
                        default:
                            System.out.println("Wow, that's a really cool pet...");
                            break;
                    }

                }
                System.out.println("\n Your pets: \n");
                for(int i = 0; i < petsLog.size(); i++){
                    System.out.println(petsLog.get(i).getClass().getSimpleName() + " " + petsLog.get(i).getName() + " says: " + petsLog.get(i).speak());
                }

            }
            turnOn = false;
        }

    }

}
