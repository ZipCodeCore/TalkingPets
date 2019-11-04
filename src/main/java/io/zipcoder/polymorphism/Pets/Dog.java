package io.zipcoder.polymorphism.Pets;

public class Dog extends Pets {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "woof!";
    }
}
