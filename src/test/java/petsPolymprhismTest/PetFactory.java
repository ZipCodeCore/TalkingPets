package petsPolymprhismTest;

import org.junit.Assert;
import org.junit.Test;
import petsPolymorphism.Pet;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by jennifermcginty on 5/6/17.
 */
public class PetFactory {

    @Test
    public void addPetsToListTest() {
        // Given
        petsPolymorphism.PetFactory petFactory = new petsPolymorphism.PetFactory();
        Pet expectedPet = new Pet("Fred", "Pet");

        // When
        petFactory.addPetToList(expectedPet);
        ArrayList<Pet> pets = petFactory.getPetList();
        Pet rescuedPet = pets.get(0);

        // Then
        Assert.assertEquals(expectedPet, rescuedPet);
    }

   // @Test
    // public void testComparePetsWithDiffrentNames(){
//        PetFactory pet = new PetFactory();
//        PetFactory animal = new PetFactory();
//
//        int expectedResult = 1;
//
//        int actualResult = pet.compareTo(animal);
//
//        assertEquals("This should return 1", expectedResult, actualResult);
//    }
}



