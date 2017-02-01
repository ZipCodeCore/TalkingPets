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
    @Before
    public void setUp(){
        pet = new PetComparator();
        cat = new Cat("Adam");
        dog = new Dog("Bravo");
        dino = new Dino("Carl");
        petList = new ArrayList<>();
        petList.add(dino);
        petList.add(dog);
        petList.add(cat);
        petList.add(dog);
    }

    @Test
    public void compare1Test(){
        int expected = 1;
        int actual = pet.compare(dog, cat);
        Assert.assertEquals("Will return a 1 because pet should be sorted behind pet", expected, actual);
    }

    @Test
    public void compare0Test(){
        int expected = 0;
        int actual = pet.compare(dog, dog);
        Assert.assertEquals("Will return a 0 because pet should be equal pet", expected, actual);
    }

    @Test
    public void compareNegative1Test(){
        int expected = -1;
        int actual = pet.compare(dog, dino);
        Assert.assertEquals("Will return a 1 because pet should be sorted in front pet", expected, actual);
    }

    @Test
    public void sortByNameTest(){
        pet.sortByName(petList);
        String expected = "List of pets by name";
        String actual = petList.toString();
        Assert.assertEquals("expected list to be sorted by Name", expected, actual);

    }

    @Test
    public void sortByTypeTest(){
        pet.sortByType(petList);
        String expected = "List of pets by type";
        String actual = petList.toString();
        Assert.assertEquals("expected list to be sorted by Type", expected, actual);
    }
}
