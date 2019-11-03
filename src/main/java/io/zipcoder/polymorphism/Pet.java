package io.zipcoder.polymorphism;

public abstract class Pet {

    //name field
    private String name;

    //constructor
    public Pet(String name) {
        this.name = name;

    }

    //name getter
    public String getName() {
        return name;
    }

    //name setter
    public void setName() {
        this.name = name;
    }

    //methods
    abstract public String speak();

    abstract public String getType();
}