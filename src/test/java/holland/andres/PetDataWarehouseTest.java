package holland.andres;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andresholland on 1/31/17.
 */
public class PetDataWarehouseTest {

    @Test
    public void getSetNumOfPetsTest () {
        PetDataWarehouse petDataWarehouse = new PetDataWarehouse();
        petDataWarehouse.setNumOfPets(5);
        int expected = 5;
        int actual = petDataWarehouse.getNumOfPets();
        assertEquals(expected, actual);
    }

    @Test
    public void addToPetsListTest () {
        PetDataWarehouse petDataWarehouse = new PetDataWarehouse();
        petDataWarehouse.addToPetsList(new Pet("testPet"));
        int expected = 1;
        int actual = petDataWarehouse.getPetsList().size();
        assertEquals(expected, actual);
    }
}