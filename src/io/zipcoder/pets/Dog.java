package io.zipcoder.pets;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public Dog() {

    }

    @Override
    public String speak() {
        return "Ruff.";
    }

}
