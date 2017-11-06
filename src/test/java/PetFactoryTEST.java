import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by danries on 1/31/17.
 */
public class PetFactoryTEST {

    PetFactory factory;
    Cat cat;
    Pet pet;

    @Before public void initialize(){
        factory = new PetFactory();
    }

    @Test
    public void makeAPetTEST(){
        String expected = (cat = new Cat("Chesire")).getName() + " " + cat.getClass().getSimpleName() ;
        String actual = (pet = factory.makeAPet("Chesire","Cat")).getName() + " " + pet.getClass().getSimpleName();
        assertEquals("We expect to get the cat we created back",expected,actual);
    }
}
