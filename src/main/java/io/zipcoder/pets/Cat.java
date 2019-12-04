package io.zipcoder.pets;

public class Cat extends Pet {

    public Cat(){
        super("Furball");
    }

    public Cat(String name){
        super(name);
    }

    public String speak() {
        return "meow ~";
    }
}
