package io.zipcoder.pets;

public class Cat extends Pet{

    public Cat() {
        super("Garfield");
    }

    public Cat(String name) {
        super(name);
    }

    public String getName(String name) {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}
