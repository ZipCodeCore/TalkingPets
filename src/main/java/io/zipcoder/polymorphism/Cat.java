package io.zipcoder.polymorphism;

public class Cat extends Pet {

    //constructor
    public Cat(String name) {

        super(name);

    }

    public String speak() {
        return "meow";
    }

    public String getType() {
        return "cat";
    }
}