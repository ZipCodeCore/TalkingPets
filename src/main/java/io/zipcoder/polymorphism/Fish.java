package io.zipcoder.polymorphism;

public class Fish extends Pet {

    public Fish(String name){
        super(name);
    }

    public String speak(){
        return "glub";
    }
}
