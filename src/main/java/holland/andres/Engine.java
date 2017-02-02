package holland.andres;

/**
 * Created by andresholland on 1/31/17.
 */
public class Engine {

    IO io = new IO();
    PetDataWarehouse petDataWarehouse = new PetDataWarehouse();
    PetGenerator petGenerator = new PetGenerator();

    public void run () {
           int numOfPets = io.askHowManyPets();
            for (int i = 0; i < numOfPets; i++) {
                String name = io.askNameOfPet();
                String type = io.askTypeOfPet();
                Pet current = petGenerator.createPet(name, type);
                petDataWarehouse.addToPetsList(current);
            }
            io.printListOfPets(petDataWarehouse.getPetsList());
    }
}
