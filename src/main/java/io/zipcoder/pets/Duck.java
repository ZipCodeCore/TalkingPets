package io.zipcoder.pets;

public class Duck extends Pet {

    public Duck() {
        super("Loba");
    }

    public Duck(String name) {
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
        return "Quack!";
    }
}
