package io.zipcoder.pets;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */

//Create an abstract class with an abstract method and a getter and setter methods
public abstract class Pet {

    private String name;

    public abstract String speak();

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }

}
