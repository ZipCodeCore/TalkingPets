package io.zipcoder.pets;

public class Cat extends Pet {

    public Cat(String name){
        super(name);
    }

    @Override
    public String speak() {
        String speak = "meow";
        return speak;
    }
}

