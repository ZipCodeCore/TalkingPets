package io.zipcoder.polymorphism;

public class Bird extends Pet {
    String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Bird(){
        super("Tweety");
    }

    @Override
    public String speak() {
        return "Chirp";
    }
}
