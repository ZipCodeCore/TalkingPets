package io.zipcoder.pets;

import java.util.Collections;

/**
 * Created by tolaniibikunle on 1/31/17.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.runProgram();
        controller.sortPets();
        System.out.println();
        controller.displayPet();
    }
}
