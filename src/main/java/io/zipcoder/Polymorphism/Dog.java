package io.zipcoder.Polymorphism;

/**
 * Created by brianmullin on 5/5/17.
 */


class Dog extends Pet {
    public Dog() {}
    public Dog(String petName) {
            super(petName, "dog");
        }

    @Override
    public String speak() {
            return "I bark";
        }
}

