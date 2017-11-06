package io.zipcoder.polymorphism;

public class Snake extends Pet {

    private String speak = "Parseltongue";

    public Snake(String name)
    {
        super(name);
    }

    public String speak()
    {
        return speak;
    }

}
