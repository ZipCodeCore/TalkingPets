package io.zipcoder.pets;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class Main {
    public static void main(String[] args){
        Controller controller = new Controller();
        controller.askUserForNumberOfPets();
        controller.askUserForPetInfo();
        controller.displayPet();
    }
}
