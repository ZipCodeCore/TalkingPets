package io.zipcoder.pets;

public class Cat extends Pet {

    public Cat(String name){
        super.setName(name);
    }

    @Override
    public String Speak() {
        String speak = "Meow";
        return speak;
    }
}
