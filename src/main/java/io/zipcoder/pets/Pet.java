package io.zipcoder.pets;


abstract class Pet {
    String name;

    abstract String speak();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
