package io.zipcoder.polymorphism.Pets;

public class Cow extends Pets {

    public Cow(String name) {
        super(name);
    }

    public Cow(){
        super("Mimi");
    }

    @Override
    public String type() {
        return "Cow";
    }

    @Override
    public String speak() {
        return "moo!";
    }
}
