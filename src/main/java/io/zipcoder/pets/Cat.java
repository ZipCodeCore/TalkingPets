package io.zipcoder.pets;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class Cat extends Pet {

    //For testing purposes, initially stub out the method with return null to satisfy the compiler's expectation of
    // a return type;


    @Override
    public String speak(){

        return "Meow";
    }

    //Create a Cat constructor; set the name by using the super class (Pet) methods
    Cat(String name){

        super.setName(name);
    }

}
