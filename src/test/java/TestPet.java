import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by andrewwong on 5/3/17.
 */
public class TestPet {
    @Test
    public void speak_PetIsADog_WoofIsSpoke(){
        //Arrange
        Pet dog = new Dog();
        String expectedSound = "Woof";

        //Act
        String actualSound = dog.speak();

        //Assert
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void speak_PetIsACat_Meow(){
        //Arrange
        Pet cat = new Cat();
        String expectedSound = "Meow";

        //Act
        String actualSound = cat.speak();

        //Assert
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void speak_PetIsABird_Chirp(){
        //Arrange
        Pet bird = new Bird();
        String expectedSound = "Chirp";

        //Act
        String actualSound = bird.speak();

        //Assert
        assertEquals(expectedSound, actualSound);
    }
}
