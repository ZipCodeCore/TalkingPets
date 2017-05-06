package petsPolymprhismTest;

import org.junit.Test;
import petsPolymorphism.Cat;
import petsPolymorphism.Dog;
import petsPolymorphism.Pet;

import static org.junit.Assert.assertEquals;

/**
 * Created by jennifermcginty on 5/6/17.
 */
public class PetTest {
        @Test
        public void testPetSpeak() {
            Pet pet = new Pet("Unknown ", "Unknown");

            //given
            String expectedResult= "HELLO HUMAN!";

            //when
            String actualResult= pet.speak();

            //then
            assertEquals("This should return HELLO HUMAN!", expectedResult, actualResult);

        }

        @Test
         public void testComparePetsWithDiffrentNames(){
            Pet pet = new Pet("George", "Cat");
            Pet animal = new Pet("Fred", "Cat");

            int expectedResult = 1;

            int actualResult = pet.compareTo(animal);

            assertEquals("This should return 1", expectedResult, actualResult);
         }

         @Test
          public void testComparePetWithSameNameDiffrentType(){
             Pet pet = new Dog("George", "Dog");
             Pet animal = new Cat("George", "Cat");

             int expectedResult = 0;

             int actualResutlt = pet.compareTo(animal);

             assertEquals("This should return a negitive number", expectedResult, actualResutlt);
         }

         @Test
            public void testComparePetsWithdDiffrentNamesSameTpes(){
              Pet pet = new Cat("Mary", "Cat");
              Pet animal = new Cat("Lucy", "Cat");

              int expectedResult = 1;

              int actualResult = pet.compareTo(animal);

              assertEquals("This should return a something", expectedResult, actualResult);
         }
    }


