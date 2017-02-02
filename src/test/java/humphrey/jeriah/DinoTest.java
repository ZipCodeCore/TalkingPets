package humphrey.jeriah;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class DinoTest {

    @Test
    public void dinoSpeaksTest(){
        Dino dino = new Dino();
        String expected = "Clever Girl";
        String actual = dino.speak();
        assertEquals("I expect the speak method to return I am your pet", expected, actual);
    }


}