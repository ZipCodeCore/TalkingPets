package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog (String name ,Integer age,String breed){
        super(name, breed, age);
    }
    @Override
    public String speak(){
        return "Bark!";
    }

    public void setName(String jim){
        name = jim;
    }

    public String getName(){
        return name;
    }
}
