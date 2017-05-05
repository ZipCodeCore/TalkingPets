package io.zipcoder.pets;


public class Goldfish extends Pet{

    Goldfish() {
        setName("Marty");
    }

    @Override
    String speak() {
        return "glub glub";
    }
}
