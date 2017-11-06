package io.zipcoder.pets;

public abstract class Pet {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();

}
