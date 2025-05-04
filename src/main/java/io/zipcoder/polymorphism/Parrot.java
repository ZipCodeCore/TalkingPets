package io.zipcoder.polymorphism;

public class Parrot extends Pet{
    public Parrot(String name) {
        super(name);
    }

    public String speak(){
        return "I do what I want";
    }
}
