package io.zipcoder.pets;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class Dog extends Pet {


    @Override
    public String speak(){

        return "Bow-wow";
    }

    //Create a Dog constructor; set the name by using the super class (Pet) methods
    Dog(String name){

        super.setName(name);
    }

    @Override
    public int compareTo(Pet petType){
        return -10;
    }
}
