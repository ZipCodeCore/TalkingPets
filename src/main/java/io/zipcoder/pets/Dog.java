package io.zipcoder.pets;

import java.util.Objects;

/**
 * Created by tolaniibikunle on 1/31/17.
 */
public class Dog extends Pet {

    public Dog(String name) {
        super.setName(name); // we are getting this input from the user and setting this information
    }

    public String speak() {
        return "roof";
    }


}


