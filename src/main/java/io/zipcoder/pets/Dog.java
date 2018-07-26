package io.zipcoder.pets;

public class Dog extends Pet{

    private String speech;

    public Dog(String name){
        super(name);
        this.speech = "Woof";
    }

    public String speak(){
        return this.speech;
    }

}
