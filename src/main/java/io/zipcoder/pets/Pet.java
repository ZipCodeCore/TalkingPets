package io.zipcoder.pets;

import java.util.Comparator;

public abstract class Pet implements Comparable<Pet>{

    private String name;

    @Override
    public String toString(){
        return "This " + this.getClass().getSimpleName()+ "'s name is " + this.getName() + " and it goes " + this.speak();
    }

    @Override
    public int compareTo(Pet other){
        String pet1Name = this.getName();
        String pet1Type = this.getClass().getSimpleName();
        String pet2Name = other.getName();
        String pet2Type = other.getClass().getSimpleName();

        int compareNames = pet1Name.compareToIgnoreCase(pet2Name);
        int compareTypes = pet1Type.compareToIgnoreCase(pet2Type);

        return compareNames == 0 ? compareTypes : compareNames;
    }

    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
