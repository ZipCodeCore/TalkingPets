package io.zipcoder.pets;

public class Hampster extends Pet {

    public Hampster(String type, String name) {
        super(type, name);
    }

    @Override
    public String speak() {
        return "Squeak, Squeak.";
    }
}
