package io.zipcoder.pets;

public class SnakeTest extends PetsTest {

    Pet pet;
    String name="NotSeth";
    String speech = "Parseltongue";

    public SnakeTest(){
        super(new Snake("Seth"), "NotSeth", "Parseltongue");
    }
}
