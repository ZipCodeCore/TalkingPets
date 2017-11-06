package io.zipcoder.polymorphism.io.zipcoder.pets;

import io.zipcoder.pets.*;

public class ParrotTest extends PetsTest{
    Pet pet;
    String name = "Polly";
    String call = "Polly wanna cracker!";


    public ParrotTest() {
        super(new Parrot(), "Polly wanna cracker!", "Polly");
    }
}
