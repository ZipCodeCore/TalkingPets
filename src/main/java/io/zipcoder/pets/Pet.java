package io.zipcoder.pets;

public abstract class Pet implements Comparable<Pet>{

    private String name;
    private String speech;

    public Pet(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public abstract String speak();

    @Override
    public int compareTo(Pet pet1){
        if (this.name.equals(pet1.getName()))
            return (this.getClass().getSimpleName().compareTo(pet1.getClass().getSimpleName()));
        else
            return (this.name.compareTo(pet1.getName()));
    }

}
