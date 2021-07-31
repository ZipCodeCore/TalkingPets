package io.zipcoder.polymorphism;

public class Bird extends Pet {
    public Bird(){
        super("Tweety");
    }

    @Override
    public String speak() {
        return "Chirp";
    }
}
