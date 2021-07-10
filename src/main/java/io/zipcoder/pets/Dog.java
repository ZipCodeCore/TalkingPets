package io.zipcoder.pets;

public class Dog extends Pets {

    public Dog () {
        this.name = "Allen, I think?";
    }

    @Override
    public String speak() {
        return "Bark";
    }
}
