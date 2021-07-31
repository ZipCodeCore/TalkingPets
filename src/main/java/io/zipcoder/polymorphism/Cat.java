package io.zipcoder.polymorphism;

public class Cat extends Pet implements Animal {

    public Cat(String name) {
        super(name);
    }

    public String getName() {
        return this.name;
    }

    public String speak() {
        return "Meow!";
    }

    public void setName(String name) {
        this.name = name;
    }
}
