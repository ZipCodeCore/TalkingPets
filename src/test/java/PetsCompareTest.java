import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import io.zipcoder.pets.PetsCompare;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by prestonbattin on 2/1/17.
 */
public class PetsCompareTest {


    PetsCompare compare;
    Pet cat, dog;
    List<Pet> list = new ArrayList();

    @Before
    public void setup(){

        Pet cat = new Cat("Stacy");
        Pet dog = new Dog("Spot");
        list.add(cat);
        list.add(dog);
    }


    @Test
    public void compareTest(){

        compare = new PetsCompare();
        Collections.sort(list, compare);

        String expected = "Spot";
        String actual = list.get(0).getName();
        Assert.assertEquals("Testing the order swap", expected, actual);
    }
}
