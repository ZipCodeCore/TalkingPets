package io.zipcoder.polymorphism;

public class Dog  extends Pet{


    String name;
    String type;

    public Dog(String name, String type){
        this.name = name;
        this.type = type;
    }


    public void speak(){

    System.out.print("woof");

    }
}
