package io.zipcoder.polymorphism;

public abstract class Pet {
    private String name;
    public abstract String speak();

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

