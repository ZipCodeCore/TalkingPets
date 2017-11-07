package io.zipcoder.polymorphism;



public abstract class Pet implements Comparable<Pet>{

    private String name;


    public String speak() {
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pet o) {
        String petName = o.getName();
        String petType = o.getClass().getSimpleName();

        int comparingTheNames = this.name.compareTo(petName);

        if (comparingTheNames == 0) {


            int comparingTheTypes = this.getClass().getSimpleName().compareTo(petType);

            return comparingTheTypes;

        }

        return comparingTheNames;

    }










}
