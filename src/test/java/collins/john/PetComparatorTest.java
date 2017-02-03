package collins.john;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by johncollins on 1/31/17.
 */


    public class PetComparatorTest {
        Pet testCat;
        Pet testDog;
        Pet testSnake;
        Pet test2Dog;
        ArrayList<Pet> testPets;
        PetComparator testComparator;

        @Before
        public void setUp() throws Exception {
            testCat = new Cat("DeltaCat");
            testDog = new Dog("AlphaDog");
            test2Dog = new Dog("BetaDog");
            testSnake = new Snake("BetaSnake");
            testPets = new ArrayList<Pet>();
            testPets.add(testDog);
            testPets.add(testSnake);
            testPets.add(testCat);
            testComparator = new PetComparator();
        }

        @Test
        public void PetCoparatorTest() {
            testComparator.sortByType(testPets);
            String actual = testPets.get(0).name;
            String expected = "AlphaDog";
            assertEquals("Should return Mr.Cat, name of the first-most sorted pet type", expected, actual
            );

        }

        @Test
        public void printPetDetailedListTest() {
            //Polymorphism.printPetDetailedListTest();
            // String actual = System.out.println(petNames+petTypes+petAges);

        }
    }

