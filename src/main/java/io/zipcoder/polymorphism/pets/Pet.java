package io.zipcoder.polymorphism.pets;

public abstract class Pet {

    private String name;

    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


