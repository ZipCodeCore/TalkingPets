import io.zipcoder.polymorphism.Cat;
import junit.framework.TestCase;
import org.junit.Assert;

public class CatTest extends TestCase {

    public void testSpeak() {
        Cat cat =new Cat(null,null,null);
        cat.speak();
        Assert.assertEquals("Meow!",cat.speak());

    }

    public void testName(){
        Cat cat  =new Cat(null,null,null);
        cat.setName("Biggs");
        String actual = cat.getName();
        String expected = "Biggs";
        Assert.assertEquals(actual, expected);
    }

    public void testBreed(){
        Cat cat = new Cat("Tess", 5, "Tuxedo");
        String actual = cat.getBreed();
        String expected = "Tuxedo";

        Assert.assertEquals(actual, expected);
    }

    public void testAge() {
        Cat cat = new Cat("Tess", 5, "Tuxedo");
        Integer actual = cat.getAge();
        Integer expected = 5;

        Assert.assertEquals(actual, expected);
    }
}
