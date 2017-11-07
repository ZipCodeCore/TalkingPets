package io.zipcoder.pets;

public class Bird extends Pet{

    public Bird(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "chirp chirp";
    }
}
