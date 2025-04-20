package io.zipcoder.polymorphism;

public class Dog extends Pet implements Animal{


    public Dog(String name) {
        super(name);
    }

    public String getName() {
        return this.name;
    }

    public String speak() {
        return "Woof!";
    }

    public void setName(String name) {
        this.name = name;
    }
}
