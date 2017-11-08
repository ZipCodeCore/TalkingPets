package io.zipcoder.polymorphism;

public class Pet implements Comparable<Pet>{

    private String name;

    public String  speak(){
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int compareTo(Pet o) {
        String getName = o.getName();
        String getType = this.name.getClass().getSimpleName();

        int comparingTheNames = this.name.compareTo(getName);

        if (comparingTheNames == 0){
            int comparingTheTypes = this.name.getClass().getSimpleName().compareTo(getType);
            return comparingTheTypes;
        }
        return comparingTheNames;
    }
}
