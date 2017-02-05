package humphrey.jeriah;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 2/3/17.
 */
public class PetComparatorTest {
    PetComparator comp;


    @Before
    public void setUp(){
        comp = new PetComparator();


    }
    @Test
    public void compareTest() {
        Dog dog1 = new Dog();
        dog1.setName("Fido");
        Cat cat1 = new Cat();
        cat1.setName("Kitten");
        int expected = -1;
        int actual = comp.compare(cat1,dog1 );
        assertEquals(expected, actual);


    }
    @Test
    public void compareTestSameType() {
        Dog dog1 = new Dog();
        dog1.setName("Fido");
        Dog dog2 = new Dog ();
        dog2.setName("Rex");
        int expected = -1;
        int actual = comp.compare(dog1,dog2 );
        assertEquals(expected, actual);


    }

}