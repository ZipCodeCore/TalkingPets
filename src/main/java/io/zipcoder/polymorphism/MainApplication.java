package io.zipcoder.polymorphism;
import java.util.List;
import java.util.Scanner;


/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    private Integer numberOfPets;
    private List<Pet> pets;
    private UserInputGetter userInput;

    //constructor
    public MainApplication() {

    }

    //methods

    public String getName(int petNumber) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        return name;
    }
}
