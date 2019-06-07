package io.zipcoder.polymorphism;

public abstract class Pet implements Comparable<Pet> {
    String name;

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

    public abstract int compareTo(Pet o);



}
