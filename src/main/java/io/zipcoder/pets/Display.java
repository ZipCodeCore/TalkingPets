package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class Display {

    private Scanner scanner = new Scanner(System.in);

    public int askUserForNumberInput(String question){
        System.out.print(question);
        return scanner.nextInt();
    }

    public String askUserForString(String question){
        System.out.print(question);
        String stringValue = scanner.next();
        return stringValue;
    }

}
