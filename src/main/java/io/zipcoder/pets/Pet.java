package io.zipcoder.pets;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
abstract public class Pet {

    String name;

    abstract public String speak();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}

