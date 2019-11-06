package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "Woof Woof";
    }

    @Override
    public int compareTo(Pet o) {
        return this.getName().compareTo(o.getName());
    }
}
