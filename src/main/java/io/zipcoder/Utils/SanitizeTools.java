package io.zipcoder.Utils;

import java.time.LocalDate;
import java.util.Scanner;

public class SanitizeTools{

    public static String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String stringInput = scanner.nextLine();
        return stringInput;
    }

    public static double getDoubleInput(String prompt){
        String stringInput;
        double doubleInput;

        do {
            stringInput = getStringInput(prompt);
            try {
                doubleInput = Double.parseDouble(stringInput);
                return doubleInput;
            } catch (IllegalArgumentException iae){
                System.out.println("Please enter a number.");
                continue;
            }
        } while (true);
    }

    public static int getIntegerInput(String prompt){
        return (int)getDoubleInput(prompt);
    }

    public static int getPositiveIntegerInput (String prompt){
        int intInput;
        do{
            intInput = getIntegerInput(prompt);
            if (intInput >= 0){
                return intInput;
            } else {
                System.out.println("Please enter a positive integer.");
                continue;
            }
        }while(true);
    }

}
