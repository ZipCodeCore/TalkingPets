package io.zipcoder.pets;

public class CatTest extends PetsTest {

    Pet pet;
    String name="NotSelena";
    String speech = "Meow";

    public CatTest(){
        super(new Cat("Selena"), "NotSelena", "Meow");
    }
}
