package io.zipcoder.Polymorphism;

/**
 * Created by brianmullin on 5/5/17.
 */

class Cat extends Pet {
    public Cat() {}
    public Cat(String petName) {
        super(petName, "cat");
    }

    @Override
    public String speak() {
        return "I meow";
    }
}