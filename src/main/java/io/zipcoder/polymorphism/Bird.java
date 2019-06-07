package io.zipcoder.polymorphism;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Comparator;

public class Bird extends Pet{

    public Bird(String name){
        super(name);
        this.type = "bird";
    }

    @Override
    public String speak() {
        return "Chirp!";
    }

    public int compareTo(Pet o){
        return this.getName().compareTo(o.getName());
    }

}
