package io.zipcoder.polymorphism;

public class Dog extends Pet {
    String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Dog(){
        super("Beans");
    }

    @Override
    public String speak() {
        return "Bark";
    }
}
