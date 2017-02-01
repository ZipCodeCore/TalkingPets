package io.zipcoder.pets;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class Snake extends Pet{


    @Override
    public String speak(){

        return "Hiss";
    }

    //Create a Snake constructor; set the name by using the super class (Pet) methods
    Snake(String name){
        super.setName(name);
    }

    @Override
    public int compareTo(Pet petType){
        return -10;
    }
}
