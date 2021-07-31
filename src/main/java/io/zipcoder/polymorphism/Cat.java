package io.zipcoder.polymorphism;

public class Cat extends Pet {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    String name;
    public Cat(){
        super("Garfield");
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
