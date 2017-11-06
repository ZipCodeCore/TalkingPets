package io.zipcoder.pets;

public class Cat extends Pet {
    public Cat(String type, String name){
        super(type,name);
    }
    @Override
    public String speak(){
        return "Meooooooow";
    }
}
