package io.zipcoder.pets;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class Dog extends Pet{

    Dog(String name){
        super.setName(name);
    }

    @Override
    public String speak(){
        return "Woof Woof";
    }
}
