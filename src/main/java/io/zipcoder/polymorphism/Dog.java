package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog() {

    }

    @Override
    public void speak(){
    System.out.println("Woof!");
    }

    public Dog (String dogsName){
        name = dogsName;
    }

}
