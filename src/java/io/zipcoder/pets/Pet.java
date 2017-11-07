package io.zipcoder.pets;

public class Pet implements Comparable<Pet> {

    public String name;




    public String Speak() {
        return " ";
    }

    public Pet(String name) {

        this.name = name;
    }

    public String setName() {         //tested
        return this.name;
    }

    public String getName() {          //tested
        return name;
    }

    @Override
    public int compareTo(Pet o) {             //tested
        if(this.getName().compareTo(o.getName())==0){
            return this.getClass().getName().compareTo(o.getClass().getName());
        } else {
            return this.getName().compareTo(o.getName());
        }
    }

//override speak method.  constructor

}

