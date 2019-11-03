package io.zipcoder.polymorphism;

public class Dog extends Pet {

    //constructor
    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "Bark";
    }

    public String getType() {
        return "dog";
    }
}
