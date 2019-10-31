package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.Pets;

public class Pet extends Pets {

    public Pet(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Whatever this animal sounds like";
    }
}
