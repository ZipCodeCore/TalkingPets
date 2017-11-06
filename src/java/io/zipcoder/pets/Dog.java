package io.zipcoder.pets;

public class Dog extends Pet {

    public Dog(String name){
        super.setName(name);
    }

    @Override
    public String Speak() {
        String speak = "bark";
        return speak;
    }
}
