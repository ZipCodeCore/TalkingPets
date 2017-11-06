package io.zipcoder.pets;

public class Dog extends Pet {

    public Dog(String name){
        super(name);
    }

    @Override
    public String Speak(String speak) {
        speak = "Bark";
        return speak;
    }
}

