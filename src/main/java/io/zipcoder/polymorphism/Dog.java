package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog(String name) {
        super(name, "dog");
    }
    public String speak() {
        String sound = "woof!";
        Console.println(sound);
        return sound;
    }
}
