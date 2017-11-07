package io.zipcoder.pets;
import java.util.*;

public class Pet implements Comparable<Pet>{
    private String type;
    private String name;

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String speak() {

        return "Pet speaking from Super";
    }
//Part 1: compare objects by name, break ties by class type
    @Override
    public int compareTo(Pet o) {
        if(this.getName().compareTo(o.getName())==0) {
            return this.getClass().getName().compareTo(o.getClass().getName());
        }
        else {
            return this.getName().compareTo(o.getName());
        }
    }

}
