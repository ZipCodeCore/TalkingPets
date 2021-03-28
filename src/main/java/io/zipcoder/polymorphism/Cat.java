package io.zipcoder.polymorphism;

public class Cat extends Pets{




    public Cat(String name) {
        super(name);
    }



    @Override
    public String speak() {
        String sound = "meow";
        return sound;

    }
}
