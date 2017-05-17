import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by andrewwong on 5/4/17.
 */
public class TestListOfPets {
    @Test
    public void addPetToList_AddPet_PetIsAdded(){
        //Arrange
        ListOfPets listOfPets = new ListOfPets();
        Pet cat = new Cat();
        int expectedLengthOfList = 1; //length will be 1 after addition of 1 pet to empty list

        //Act
        listOfPets.addPetToList(cat);
        int actualLengthOfList = listOfPets.getListOfPets().size();

        //Assert
        assertEquals(expectedLengthOfList,actualLengthOfList);
    }
}
