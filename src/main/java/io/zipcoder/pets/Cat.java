package io.zipcoder.pets;

public class Cat extends Pet{
    public Cat(String name, Integer id) {
        super(name, id);
    }

    public Cat() {
        super("Cat", null);
    }

    @Override
    public String speak(){
        return "Meow!";
    }
}
