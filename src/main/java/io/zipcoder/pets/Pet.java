package io.zipcoder.pets;

public class Pet {


    private String name;
    private String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public Pet(String name){
        this.name=name;
    }


    public String speak() {
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}