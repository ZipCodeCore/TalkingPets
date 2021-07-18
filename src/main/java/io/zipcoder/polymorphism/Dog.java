package io.zipcoder.polymorphism;

public class Dog extends Pet{
    String breed;

    public Dog(String name) {
        super(name);
    }
    public Dog (String name, String breed){
        super(name);
        this.breed = breed;
    }

    public String speak(){
        return "Woof woof!";
    }
}
