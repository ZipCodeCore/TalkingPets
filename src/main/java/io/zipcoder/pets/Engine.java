package io.zipcoder.pets;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class Engine {
    InputOutput io = new InputOutput();
    PetDataWarehouse petDW = new PetDataWarehouse();

    void run() {
        petDW.setNumberOfPets(io.askHowManyPets());
        for(int i = 0; i<petDW.getNumberOfPets();i++) {
            String name = io.askNameOfPet();
            String type = io.askTypeOfPet();
            petDW.addPet(PetGenerator.createPet(name,type));
        }
        io.printList(petDW.getPetsList());

    }
}
