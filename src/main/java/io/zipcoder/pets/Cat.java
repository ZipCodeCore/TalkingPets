package io.zipcoder.pets;

public class Cat extends Pet{

    private String speech;

    public Cat(String name){
        super(name);
        this.speech = "Meow";
    }

    public String speak(){
        return this.speech;
    }

}
