package io.zipcoder.polymorphism;

public class Cat extends Pet {
    public Cat(){
        super("Garfield");
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
