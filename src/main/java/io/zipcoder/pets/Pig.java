package io.zipcoder.pets;

/**
 * Created by prestonbattin on 1/31/17.
 */
public class Pig extends Pet {


    private String type = "Pig";

    @Override
    public String speak(){

        return "Oink";

    }

    public Pig(String name){

        super(name);
    }

    @Override
    public String getType() {
        return type;
    }
}
