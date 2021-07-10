package io.zipcoder.polymorphism;

public class Cat extends Pet{
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public String speak() {
        return "Meow";
    }
}
