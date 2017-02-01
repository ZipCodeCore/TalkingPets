import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by randallcrame on 2/1/17.
 */
public class PetComparatorTest {

    PetComparator pet;
    Cat cat;
    Dog dog;
    Dino dino;
    ArrayList<Pet> petList;
    PetDataWarehouse petWare;
    @Before
    public void setUp(){
        pet = new PetComparator();
        petWare = new PetDataWarehouse();
        cat = new Cat("Adam");
        dog = new Dog("Bravo");
        dino = new Dino("Carl");
        petWare.addPet("Adam", "Cat");
        petWare.addPet("Bravo", "Dog");
        petWare.addPet("Carl", "Dino");
        petWare.addPet("King", "Dog");
    }

    @Test
    public void compare1Test(){
        int expected = 1;
        int actual = pet.compare(dog, cat);
        Assert.assertEquals("Will return a 1 because dog should be sorted behind cat", expected, actual);
    }

    @Test
    public void compare0Test(){
        int expected = 0;
        int actual = pet.compare(dog, dog);
        Assert.assertEquals("Will return a 0 because dog should be equal dog", expected, actual);
    }

    @Test
    public void compareNegative1Test(){
        int expected = -6;
        int actual = pet.compare(dino, dog);
        Assert.assertEquals("Will return a -6 because dino should be sorted in front dog", expected, actual);
    }

    @Test
    public void compareNullTest(){
        int expected = -6;
        int actual = pet.compare(null, null);
        Assert.assertEquals("Will return a -6 because dino should be sorted in front dog", expected, actual);
    }

}
