package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfPets = 0;

        System.out.print("How many pets do you have: ");
        while (numberOfPets <= 0) {
            while (!input.hasNextInt()) {
                System.out.println("That's not a valid number!");
                input.next();
            }
            numberOfPets = input.nextInt();
            if (numberOfPets == 0) {
                System.out.println("That's too bad, pets are great!");
                break;
            } else if (numberOfPets < 0) {
                System.out.println("That's not a valid number!");
            }
        }
        System.out.println("Thanks. You have " + numberOfPets + " pets.");
    }

}


//
//                } else {
  //               numberOfPets = input.nextInt();
//                }

  //              while (numberOfPets < 0)
//                }
//                System.out.println("Thanks, you have " + numberOfPets + " pets.");
//            }