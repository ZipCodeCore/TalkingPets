package io.zipcoder.polymorphism;

public class Cat extends Pet {

    private String speak = "Meow";

    public Cat(String name)
    {
        super(name);
    }

    public String speak()
    {
        return speak;
    }

}
