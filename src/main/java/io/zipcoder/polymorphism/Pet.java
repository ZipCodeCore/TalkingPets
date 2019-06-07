package io.zipcoder.polymorphism;

import java.util.ArrayList;

public abstract class Pet implements Comparable<Pet> {
    String name;
    String type;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String speak() {
        return "animal talk!";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract int compareTo(Pet o);

    @Override
    public String toString() {
        return "Pet list: " +
                "name: " + getName() + ' ' + getType() + '\n';
    }

}
