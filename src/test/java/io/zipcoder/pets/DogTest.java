package io.zipcoder.pets;

public class DogTest extends PetsTest {

    Pet pet;
    String name="NotFido";
    String speech = "Woof";

    public DogTest(){
        super(new Dog("Fido"), "NotFido", "Woof");
    }
}
