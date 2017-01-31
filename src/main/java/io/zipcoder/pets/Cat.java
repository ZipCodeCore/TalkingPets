package io.zipcoder.pets;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class Cat extends Pet{

    Cat(String name){
        super.setName(name);
    }

    @Override
    public String speak(){
        return "Meow";
    }
}
