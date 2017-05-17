import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by andrewwong on 5/4/17.
 */
public class TestDisplay {

//    @Test
//    public void askHowManyPets(){
//        //Arrange
//        int numberOfPets = 3;
//        int expectedNumberOfPets = 3;
//        Display display = new Display();
//
//        //Act
//        int actualNumberOfPets = display.askUserHowManyPets();
//
//        //Assert
//        assertEquals(expectedNumberOfPets, actualNumberOfPets);
//    }

    @Test
    public void printName_HasName_NameIsPrinted(){
        //Arrange
        Pet cat = new Cat();
        cat.setName("Bongo");
        String expectedNamePrinted = "Bongo";
        Display display = new Display();

        //Act
        String actualNamePrinted = display.printName(cat);

        //Assert
        assertEquals(expectedNamePrinted, actualNamePrinted);
    }
}
