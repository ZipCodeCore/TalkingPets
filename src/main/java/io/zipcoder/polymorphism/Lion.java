package io.zipcoder.polymorphism;

public class Lion extends Pet{

    public Lion(String name) {
        super(name);
    }

    public Lion() {

    }

    @Override
    public String speak() {super.speak();
    String sound = "Rawr";
    return sound;
    }
}
