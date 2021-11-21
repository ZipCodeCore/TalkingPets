package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat(String name ,Integer age,String breed) {
        super(name, breed, age);
    }

    @Override
    public String speak(){
        return "Meow!";
    }

    public void setName(String milo){
        name = milo;
    }

    public String getName(){
        return name;
    }
}
