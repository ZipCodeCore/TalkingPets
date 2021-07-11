package io.zipcoder.pets;

public class Horse extends Pet {

    public Horse(String name, Integer id) {
        super(name, id);
    }

    public Horse() {
        super("Horse", null);
    }

    @Override
    public String speak(){
        return "Neigh!";
    }
}
