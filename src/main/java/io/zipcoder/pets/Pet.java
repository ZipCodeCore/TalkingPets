package io.zipcoder.pets;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class Pet {

    String name;

    String speak(){ return "I am pet";}

    Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
