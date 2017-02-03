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

    @Test
    public void sortByNameTest(){
        wareHouse.addPet("dog", "rex");
        wareHouse.addPet("dog", "arf");
        wareHouse.addPet("dog", "yip");
        for (int i = 0; i< wareHouse.getPetList().size();i++){System.out.print(wareHouse.getPetList().get(i).getName() + " ");}
        wareHouse.sortByName(wareHouse.getPetList());
        System.out.println("");
        for (int i = 0; i< wareHouse.getPetList().size();i++){System.out.print(wareHouse.getPetList().get(i).getName() + " ");}
        String expected = "rex";
        String actual = wareHouse.getPetList().get(1).getName();

        assertEquals("I expect that after sorting, the second element in the array will be named rex,", expected, actual);

    }
    @Test
    public void sortByTypeTest(){
        wareHouse.addPet("dino", "rex");
        wareHouse.addPet("dog", "arf");
        wareHouse.addPet("cat", "yip");
        for (int i = 0; i< wareHouse.getPetList().size();i++){System.out.print(wareHouse.getPetList().get(i).getClass().getSimpleName() + " ");}
        wareHouse.sortByType(wareHouse.getPetList());
        System.out.println("");
        for (int i = 0; i< wareHouse.getPetList().size();i++){System.out.print(wareHouse.getPetList().get(i).getClass().getSimpleName() + " ");}
        String expected = "Dino";
        String actual = wareHouse.getPetList().get(1).getClass().getSimpleName();

        assertEquals("I expect that after sorting, the second element in the array will be named rex,", expected, actual);

    }


}