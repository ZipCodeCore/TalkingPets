package io.zipcoder.polymorphism;

public class Dog extends Pet {


    private String speak = "Woof";

    public Dog(String name)
    {
        super(name);
    }

    public String speak()
    {
        return speak;
    }





}