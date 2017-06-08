package petsPolymprhismTest;

import org.junit.Test;
import petsPolymorphism.Cat;
import petsPolymorphism.Dog;
import petsPolymorphism.Pet;
import petsPolymorphism.ObjectOfPetComparison;

import static org.junit.Assert.assertEquals;

/**
 * Created by jennifermcginty on 5/6/17.
 */
public class ObjectOfPetComparisonTest {


    @Test
    public void testComparePetTypeForSameType(){
        ObjectOfPetComparison objectOfPetComparison = new ObjectOfPetComparison();

        Pet pet = new Cat("Mary", "Cat");
        Pet animal = new Cat("Lucy","Cat");

        int expectedResult = 0;

        int actualResult = objectOfPetComparison.compare(pet,animal);

        assertEquals("This is going to return zero", expectedResult, actualResult);
    }

    @Test
    public void testCompareDiffrentPetTypes(){
        ObjectOfPetComparison objectOfPetComparison = new ObjectOfPetComparison();

        Pet pet = new Cat("Mary", "Cat");
        Pet animal = new Dog("Stu", "Dog");

        int expectedResult = -1;

        int actualResult = objectOfPetComparison.compare(pet, animal);

        assertEquals("This should return negitive", expectedResult, actualResult);
    }

    @Test
    public void testIfTheTypesAreTheSameAndTheNamesAreTheSame(){
        ObjectOfPetComparison objectOfPetComparison = new ObjectOfPetComparison();

        Pet pet = new Cat("Mary","Cat");
        Pet animal = new Cat("Mary", "Cat");

        int expectedResult = 0;

        int actualResult = objectOfPetComparison.compare(pet,animal);

        assertEquals("This should be zero", expectedResult, actualResult);
    }
}
