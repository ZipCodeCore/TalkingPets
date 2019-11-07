package io.zipcoder.polymorphism;

import java.util.logging.Logger;

public class Dog extends Pets {

    public Dog(String petName) {
    }
    public Dog(String name, String type){
        super(name, type);

    }

    @Override
    public String speak() {
        return "Woof";
    }
}
