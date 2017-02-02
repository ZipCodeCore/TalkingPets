package humphrey.jeriah;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class PetDataWareHouseTest {
    PetDataWareHouse wareHouse;

    @Before
    public void setUp(){
        wareHouse = new PetDataWareHouse();
    }


    @Test
    public void addPetDogTest(){
        wareHouse.addPet("dog","Fido");
        int expected = 1;
        int actual = wareHouse.getPetList().size();
        assertEquals(expected, actual);

    }
    @Test
    public void addPetCatTest(){
        wareHouse.addPet("cat","Fido");
        int expected = 1;
        int actual = wareHouse.getPetList().size();
        assertEquals(expected, actual);

    }
    @Test
    public void addPetDinoTest(){
        wareHouse.addPet("dino","Fido");
        int expected = 1;
        int actual = wareHouse.getPetList().size();
        assertEquals(expected, actual);

    }

}