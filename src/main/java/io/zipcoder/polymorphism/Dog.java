package io.zipcoder.polymorphism;
import java.lang.Comparable;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Woof!";
    }

    public int compareTo(Pet o){
        return this.getName().compareTo(o.getName());
    }
}
