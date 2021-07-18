package io.zipcoder.pets;

public class Dog extends Pet{

    public Dog() {
        super("Mochi");
    }

    public Dog(String name) {
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
        return "Woof!";
    }
}
