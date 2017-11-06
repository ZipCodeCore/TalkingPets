package io.zipcoder.pets;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public Cat() {

    }

    @Override
    public String speak() {
        return "Rawr.";
    }

}
