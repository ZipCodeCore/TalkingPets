package io.zipcoder.pets;

public class Dog extends Pet{

    public Dog(String name, Integer id) {
        super(name, id);
    }

    public Dog() {
        super("Dog", null);
    }

    @Override
    public String speak(){
        return "Bark!";
    }
}
