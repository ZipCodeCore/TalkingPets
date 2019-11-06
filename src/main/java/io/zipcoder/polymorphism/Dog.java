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
        // do this for remaining pets
        if (this.getName().compareTo(o.getName()) == 0) {
            this.getClass().getName();  // class name of this pet
            o.getClass().getName();     // class name pet o
            return this.getClass().getName().compareTo(o.getClass().getName());
        } else {
            return this.getName().compareTo(o.getName());
        }
    }
}
