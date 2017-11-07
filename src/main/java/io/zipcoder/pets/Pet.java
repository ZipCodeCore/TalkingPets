package io.zipcoder.pets;

import java.util.Comparator;

public abstract class Pet implements Comparable<Pet>{

    private String name;

    @Override
    public String toString(){
        return "This "+this.getClass().getSimpleName()+"'s name is "+this.getName()+" and it goes "+this.speak();
    }

    @Override
    public int compareTo(Pet other){
        boolean ifNameEqual = this.getName().equalsIgnoreCase(other.getName());
        int compareTypes = this.getClass().getSimpleName().compareToIgnoreCase(other.getClass().getSimpleName());
        int compareNames = this.getName().compareToIgnoreCase(other.getName());
        return ifNameEqual ? compareTypes : compareNames;
    }

    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Comparator<Pet> compareByType = (a, b) -> {
        boolean ifTypeEqual = a.getClass().getSimpleName().equalsIgnoreCase(b.getClass().getSimpleName());
        int compareNames = a.getName().compareToIgnoreCase(b.getName());
        int compareTypes = a.getClass().getSimpleName().compareToIgnoreCase(b.getClass().getSimpleName());
        return ifTypeEqual ? compareNames : compareTypes;
    };
}
