/**
 * Created by randallcrame on 1/31/17.
 */
public class Engine {
    InputOutput io = new InputOutput();
    PetDataWarehouse petDataWarehouse = new PetDataWarehouse();

    public void run(){
        System.out.println(io.askForNumberOfPets());
        petDataWarehouse.setNumberOfPets(io.getInputInteger());
        questionLoop();
        io.petList(petDataWarehouse.getPetList());
    }

    private void questionLoop(){
        for (int i= 0;i < petDataWarehouse.getNumberOfPets(); i++){
            System.out.println(io.askNameOfPet());
            String name = io.getInputString();
            System.out.println(io.askKindOfPet());
            String kind = io.getInputString();
            petDataWarehouse.addPet(name, kind);
        }
    }
}
