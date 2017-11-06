package io.zipcoder.pets;


public class Bird extends Pet {
    public Bird(String type, String name) {
        super(type, name);
    }

    @Override
    public String speak() {
        return "Chirp";
    }
}
