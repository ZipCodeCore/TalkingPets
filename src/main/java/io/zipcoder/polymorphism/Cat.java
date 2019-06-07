package io.zipcoder.polymorphism;
import java.lang.Comparable;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow!";
    }

    public int compareTo(Pet o){
        return this.getName().compareTo(o.getName());
    }
}
