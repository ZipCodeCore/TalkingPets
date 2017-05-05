import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pets.Cat;
import pets.Dog;
import pets.Pet;
import pets.PetComparator;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by cameronsima on 5/5/17.
 */
public class PetsTests {

    Cat cat;
    Dog dog;
    Dog dog2;
    Cat cat2;

    Pet[] pets;

    @Before
    public void setUp() {
        cat = new Cat();
        cat.setName("Garfield");

        dog = new Dog();
        dog.setName("Lassie");

        dog2 = new Dog();
        dog2.setName("Buddy");

        cat2 = new Cat();
        cat2.setName("Buddy");

        pets = new Pet[]{cat, dog, cat2, dog2};
    }


    @Test
    public void testCreatePets() {

        Cat cat = new Cat();
        String actualValue = cat.speak();
        String expectedValue = "meow";

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testComparable() {

        Pet[] expectedValue = {cat2, dog2, cat, dog};

        Arrays.sort(pets);

        Assert.assertEquals(expectedValue, pets);
    }

    @Test
    public void testPetComparator() {

        PetComparator petComp = new PetComparator();

        Pet[] expectectValue = {cat2, cat, dog2, dog};

        Arrays.sort(pets, petComp);

        Assert.assertEquals(expectectValue, pets);


    }
}
