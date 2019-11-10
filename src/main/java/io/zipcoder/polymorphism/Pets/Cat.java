package io.zipcoder.polymorphism.Pets;

public class Cat extends Pets {

    public Cat(String name) {

        super(name);
    }

    public Cat(){
        super("Fluffy");
    }

    @Override
    public String type() {
        return "Cat";
    }

    @Override
    public String speak() {
        return "meow!";
    }
}
