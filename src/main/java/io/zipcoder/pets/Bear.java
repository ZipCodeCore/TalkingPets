package io.zipcoder.pets;

public class Bear extends Pet {
    public Bear(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "*chews Human*";
    }
}