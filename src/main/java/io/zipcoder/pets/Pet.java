package io.zipcoder.pets;

/**
 * Created by tolaniibikunle on 1/31/17.
 */
    public abstract class Pet {

    private String name;

 public abstract String speak();


    public String getName() {
        return name;
    }

    public String setName(String name) {

        return this.name = name;
    }
}
