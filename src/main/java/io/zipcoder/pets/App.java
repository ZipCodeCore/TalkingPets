package io.zipcoder.pets;

import java.util.Collection;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class App {

    public static void main(String[] args){
        Controller controller = new Controller();

        controller.askUserForNumberOfPets();
        controller.askUserForPetInfo();
        controller.displayPets();
    }
}
