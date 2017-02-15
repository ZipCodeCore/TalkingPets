package io.zipcoder.pets;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class Cat extends Pet {
    // CONSTRUCTORS
    public Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }
    Cat() {}

    // OVERRIDE METHOD
    public String speak() {
        return "I'm a Samurai Pizza Cat!";
    }
}
