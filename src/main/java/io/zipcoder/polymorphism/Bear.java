package io.zipcoder.polymorphism;

public class Bear extends Pet implements Animal {


    public Bear(String name) {
        super(name);
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "Roar!";
    }
}
