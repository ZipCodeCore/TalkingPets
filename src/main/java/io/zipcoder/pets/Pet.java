package io.zipcoder.pets;

import io.zipcoder.polymorphism.Animal;

public abstract class Pet implements Animal {
    private String name;
    private String type;

    protected Pet() {
    }

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "";
    }
}
