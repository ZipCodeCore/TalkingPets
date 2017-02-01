import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import io.zipcoder.pets.PetFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tolaniibikunle on 1/31/17.
 */
public class PetFactoryTest {
  PetFactory petFactory;
    Pet dog;


    @Before
    public void setUp(){
        petFactory = new PetFactory();
       dog = petFactory.makeAPet("dog","noah");
   }
   @Test
   public void getMakeAPetNameTest(){
       String expected = "Dog";
        String actual = dog.getClass().getSimpleName();
       Assert.assertEquals("I am expecting a dog named noah",expected,actual);
    }
    @Test
    public void getMakeAPetTypeTest(){
       String expected = "noah";
       String actual = dog.getName();
       Assert.assertEquals("I am expecting noah", expected,actual);
    }
}
