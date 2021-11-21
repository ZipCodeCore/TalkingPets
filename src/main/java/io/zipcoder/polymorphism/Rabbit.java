package io.zipcoder.polymorphism;

public class Rabbit extends Pet{
    public Rabbit(String name ,Integer age,String breed){
        super(name, breed, age);
    }
    @Override
    public String speak(){
        return "rab rab!";
    }

    public void setName(String lucky){
        name = lucky;
    }

    public String getName(){
        return name;
    }
}
