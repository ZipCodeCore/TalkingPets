package io.zipcoder.Polymorphism;

/**
 * Created by brianmullin on 5/5/17.
 */


class Bird extends Pet {
    public Bird() {}
    public Bird(String petName) {
        super(petName, "bird");
    }

    @Override
    public String speak() {
        return "I sing";
    }
}