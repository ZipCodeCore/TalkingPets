package io.zipcoder.polymorphism;

public class Dinosaur extends Pet{
    public Dinosaur(String name,Integer age,String breed){
        super(name,age,breed);
    }

    @Override
    public String speak(){
        return "Rawr!";
    }

    public void setName(String joseph) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
