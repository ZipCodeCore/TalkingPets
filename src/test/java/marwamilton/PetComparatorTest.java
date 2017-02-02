package marwamilton;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mkulima on 2/1/17.
 */
public class PetComparatorTest {

    @Test
    public void compareTest(){
        PetComparator petComparator = new PetComparator();
        Pet dog1 = new Dog("derrtydog");
        Pet dog2 = new Dog("herrtydog");

        Assert.assertTrue(0>petComparator.compare(dog1,dog2));
    }

}
