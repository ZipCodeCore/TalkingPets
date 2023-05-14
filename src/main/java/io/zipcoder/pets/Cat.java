package io.zipcoder.pets;

/**
 * Created by prestonbattin on 1/31/17.
 */
public class Cat extends Pet {

    private String type = "Cat";

    @Override
    public String speak(){

        return "Meow";
    }

    public Cat(String name){

        super(name);
    }

    @Override
    public String getType() {
        return type;
    }
}
