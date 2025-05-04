package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat(String name,Integer age,String breed){
        super(name,age,breed);
    }

    @Override
    public String speak(){
        return "Meow!";
    }

    public void setName(String biggs) {
        this.name=name;
    }

    public String getName() {

    return name;
    }
}
