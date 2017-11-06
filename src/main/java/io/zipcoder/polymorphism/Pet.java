package io.zipcoder.polymorphism;

public abstract class Pet {
    static String name;
    static String type;

    public String speak(String type , String speech){
        return ( name + " is a " + type +  " and it goes " + speech + " !");
    }


    
}
