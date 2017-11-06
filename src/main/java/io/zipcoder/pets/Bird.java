package io.zipcoder.pets;

public class Bird extends Pet{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak (){
        System.out.println("gurr");
    }
}
