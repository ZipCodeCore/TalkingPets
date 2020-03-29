package io.zipcoder.pets;

public class Dog extends Pet {
    // private static String name = "";

    public Dog(String type, String name) {
        super(type, name);
    }

    @Override
    public String speak() {
        return "Ruff Ruff";
    }
}
