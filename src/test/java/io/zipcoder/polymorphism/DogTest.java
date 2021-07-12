import io.zipcoder.polymorphism.Dog;
import junit.framework.TestCase;
import org.junit.Assert;

public class DogTest extends TestCase {

    public void testSpeak() {
        Dog dog =new Dog(null,null,null);
        dog.speak();
        Assert.assertEquals("Bark!",dog.speak());

    }

    public void testName(){
        Dog dog  = new Dog(null,null,null);
        dog.setName("Biggs");
        String actual = dog.getName();
        String expected = "Biggs";
        Assert.assertEquals(actual, expected);
    }

    public void testBreed(){
        Dog dog  = new Dog("Tess", 5, "Tuxedo");
        String actual = dog.getBreed();
        String expected = "Tuxedo";

        Assert.assertEquals(actual, expected);
    }

    public void testAge() {
        Dog dog  = new Dog("Tess", 5, "Tuxedo");
        Integer actual = dog.getAge();
        Integer expected = 5;

        Assert.assertEquals(actual, expected);
    }
}
