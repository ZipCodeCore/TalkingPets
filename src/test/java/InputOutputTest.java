import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by randallcrame on 1/31/17.
 */
public class InputOutputTest {
    InputOutputMock io;

    @Before
    public void setUp(){
        io = new InputOutputMock();
    }

    @Test
    public void getInputIntegerTest(){
        int expected = 5;
        int actual = io.getInputInteger();
        Assert.assertEquals("Expected a return of 5", expected, actual);
    }

    @Test
    public void getInputStringTest(){
        String expected = "This is a String";
        String actual = io.getInputString();
        Assert.assertEquals("Expected a return of 5", expected, actual);
    }


}
