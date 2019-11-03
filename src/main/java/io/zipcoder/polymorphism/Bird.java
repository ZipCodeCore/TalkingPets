package io.zipcoder.polymorphism;

public class Bird extends Pet {
    public Bird(String name) {
        super(name, "bird");
    }
    public String speak() {
        String sound = "chirp!";
        Console.println(sound);
        return sound;
    }
}