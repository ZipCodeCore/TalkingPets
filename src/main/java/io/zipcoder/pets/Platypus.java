package io.zipcoder.pets;

public class Platypus extends Pet {

    public Platypus(){
        super("Perry");
    }
    public Platypus(String name) {
        super(name);
    }
    public String speak() {
        return "Perry the platypus noises";
    }
}
