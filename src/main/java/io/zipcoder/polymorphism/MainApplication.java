package io.zipcoder.polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int number = input.nextInt();

        System.out.println("What types of pets do you have?");
        ArrayList <String> species = new ArrayList<String>();
        for (int i = 1; i <= number; i++){
            species.add(input.next());
        }

        System.out.println("What are their names?");
        ArrayList<String> name = new ArrayList<String>();
        for (int j = 1; j <=number; j++) {
            name.add(input.next());
        }

        System.out.printf(name + "\n" + species + "\n");


    }
}
