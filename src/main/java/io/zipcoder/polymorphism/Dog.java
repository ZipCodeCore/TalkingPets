package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog(){
        super("Beans");
    }

    @Override
    public String speak() {
        return "Bark";
    }
}
