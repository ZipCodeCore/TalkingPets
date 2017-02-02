package marwamilton;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mkulima on 1/31/17.
 */
public class PetsMainTest {


    @Test
    public void createPetTest(){
        PetsMain petsMain = new PetsMain();
        Pet testPet = petsMain.createPet("Dog", "derrtyBwuoy");
        String expectedPetName = "derrtyBwuoy" ;
        Assert.assertEquals("pet name mismatch", expectedPetName, testPet.getName());

        String expectedPetKind = "marwamilton.Dog";
        Assert.assertEquals("pet name mismatch", expectedPetKind, testPet.getClass().getName());
    }
}
