package io.zipcoder.pets;
/**
 * Created by tolaniibikunle on 1/31/17.
 */
public class Cow extends Pet {

    public Cow(String name) {
        this.setName(name); // you are setting this name variable from the parent class to this instance of name;

    }
    public String speak(){
        return "moo";
    }
}
