import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by mollyarant on 5/6/17.
 */
public class TestPetFactory {

    @Test
    public void addPetsToListTest() {
        // Given
        PetFactory petInformationGatherer = new PetFactory();
        Pet expectedPet = new Pet("Fred", "Pet");

        // When
        petInformationGatherer.addPetToList(expectedPet);
        ArrayList<Pet> pets = petInformationGatherer.getPetList();
        Pet rescuedPet = pets.get(0);

        // Then
        Assert.assertEquals(expectedPet, rescuedPet);
    }


}
