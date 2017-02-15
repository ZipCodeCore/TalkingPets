package io.zipcoder.pets;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class Dog extends Pet {
    // CONSTRUCTORS
    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }
    Dog() {}

    // OVERRIDE METHOD
    public String speak() {
        return "Kick, punch, it's all in the mind!";
    }
}
