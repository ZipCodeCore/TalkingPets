package io.zipcoder.polymorphism;

public class Pet {

    String name;
    public Pet(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String speak(){
        return "screech";
    }
}
