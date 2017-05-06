package petsPolymorphism;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by jennifermcginty on 5/4/17.
 */
public class Pet implements Comparable<Pet>{
    String petName;
    String petType;

    public Pet(String petName, String petType) {
        this.petName = petName;
        this.petType = petType;

    }

    public String getPetName(){

        return this.petName;
    }


    public void setPetName() {

        this.petName = petName;
    }


    public String getPetType()
    {
        return this.petType;
    }


    public void setPetType() {

        this.petType = petType;
    }


    public String speak() {
        String greeting = "HELLO HUMAN!";
        return greeting;
    }


    public int compareTo(Pet o) {
        if(this.petName.equals(o.getPetName())) {

            int compareClass = this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
            return compareClass;
        }

        else{
            return  this.petName.compareTo(o.getPetName());
        }
    }
}

