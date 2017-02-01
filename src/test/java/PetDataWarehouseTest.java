import org.junit.Before;
import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by randallcrame on 1/31/17.
 */
public class PetDataWarehouseTest {

    PetDataWarehouse petWare;
    @Before
    public void setUp(){
        petWare = new PetDataWarehouse();
    }

    @Test
    public void addPetTest(){
        String expected = "Dog";
        petWare.addPet("Sam", "Dog");
        String actual = petWare.getPetList().get(0).getClass().getSimpleName();
    }
}
