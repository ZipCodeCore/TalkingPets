package io.zipcoder.polymorphism.Pets;

public class Cow extends Pets {

    public Cow(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "moo!";
    }
}
