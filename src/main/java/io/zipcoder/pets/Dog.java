package io.zipcoder.pets;

public class Dog extends Pet{

    public Dog(String type, String name) {
        super(type, name);
    }
    @Override
    public String speak(){
        return "Wooooof";
    }
}
