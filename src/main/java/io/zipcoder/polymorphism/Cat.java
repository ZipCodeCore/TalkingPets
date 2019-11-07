package io.zipcoder.polymorphism;

public class Cat extends Pets{

    public Cat(String petName, String petType) {
        super(petName, petType);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
