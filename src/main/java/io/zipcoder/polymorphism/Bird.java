package io.zipcoder.polymorphism;

public class Bird extends Pets{



    public Bird(String name) {
        super(name);
    }

    @Override
    public String speak() {
        String sound = "chirp";
        return sound;

    }
}
