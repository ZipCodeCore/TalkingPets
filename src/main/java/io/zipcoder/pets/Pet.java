package io.zipcoder.pets;

import java.util.Comparator;

public class Pet implements Comparable<Pet>{
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "Hello";
    }

    public int compareTo(Pet p) {

        if(this.getName().equals(p.getName())){
            return this.getClass().getSimpleName().compareTo(p.getClass().getSimpleName());
        } else return this.getName().compareTo(p.getName());
    }

}

class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Bark";
    }

}

class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Meow";
    }

}
class Pig extends Pet {

    public Pig(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Oink";
    }

}
