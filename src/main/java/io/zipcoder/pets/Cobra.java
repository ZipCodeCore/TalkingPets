package io.zipcoder.pets;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public class Cobra extends Pet {
    // CONSTRUCTORS
    public Cobra(String name, String type) {
        this.name = name;
        this.type = type;
    }
    Cobra() {}

    // OVERRIDE METHOD
    public String speak() {
        return "Now I know, and knowing is half the battle!";
    }
}
