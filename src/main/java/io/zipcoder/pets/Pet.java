package io.zipcoder.pets;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */

//Create an abstract class with an abstract method and a getter and setter methods
public abstract class Pet implements Comparable<Pet> {

    private String name;

    public abstract String speak();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    @Override
    public int compareTo(Pet pet){
        return 0;
    }

    //Modify compareTo so that we can compare by name then type (int = 0) or by type then name (int = 1)
    public int compareTo(Pet pet, int compareType){
        if(compareType == 0){
            return compareToByNameThenType(pet);
        } else
            return compareToByTypeThenName(pet);
    }

    private int compareToByNameThenType(Pet otherPet){
        //Compare by the Pet name then compare by the Pet type
        if(compareNames(otherPet) == 0){
            return compareTypes(otherPet);
        } else
            return compareNames(otherPet);
    }

    private int compareToByTypeThenName(Pet otherPet){
        //Compare by the Pet type then compare by the Pet name
        if(compareTypes(otherPet) == 0){
            return compareNames(otherPet);
        } else
            return compareTypes(otherPet);
    }

    private int compareNames(Pet otherPet){

        return this.getName().compareTo(otherPet.getName());
    }

    private int compareTypes(Pet pet){
        return this.getClass().getSimpleName().compareTo(pet.getClass().getSimpleName());
    }

}
