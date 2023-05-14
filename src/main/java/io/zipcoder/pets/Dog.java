package io.zipcoder.pets;

/**
 * Created by prestonbattin on 1/31/17.
 */
public class Dog extends Pet {

    private String type = "Dog";

    @Override
    public String speak(){

       return "Woof";
    }

    public Dog(String name){

        super(name);
    }

    @Override
    public String getType() {
        return type;
    }
}

