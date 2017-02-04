package io.zipcoder.pets;

import javax.print.attribute.standard.Compression;

/**
 * Created by tolaniibikunle on 1/31/17.
 */
    abstract class Pet implements Comparable<Pet> {

    private String name;

 abstract String speak();
    @Override
    public int compareTo(Pet pet){ // you need to run this function
        int compareValues = this.compareNames(pet);
        if(compareValues == 0){
            compareValues = this.compareTypes(pet);
        }
        return compareValues;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {

        return this.name = name;
    }
   public int compareNames(Pet secondPet){
        return this.getName().compareTo(secondPet.getName());
   }
    public int compareTypes(Pet secondPet){
       return this.getClass().getSimpleName().compareTo(secondPet.getClass().getSimpleName());
    }
    }
