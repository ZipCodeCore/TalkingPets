package io.zipcoder.polymorphism;

public class Snake extends Pet {
    public Snake(String name) {
        super(name, "snake");
    }
    public String speak() {
        String sound = "slither!";
//        Console.println(sound);
        return sound;
    }
}