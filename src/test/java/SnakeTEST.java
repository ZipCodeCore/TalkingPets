import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by danries on 1/31/17.
 */
public class SnakeTEST {

    Snake snake;

    @Before public void initialize(){
        snake = new Snake("Biter");
    }

    @Test
    public void snakeSpeakTEST(){
        String expected = "Hisssssss";
        String actual = snake.speak();
        assertEquals("We expect to get Hisssssss for the snake Type",expected,actual);
    }

}
