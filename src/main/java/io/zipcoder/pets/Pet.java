package io.zipcoder.pets;

/**
 * Created by prestonbattin on 1/30/17.
 */
public abstract class Pet implements Comparable {

   private String name;

   Pet(String name){

       this.name = name;
   }

   public abstract String speak();

    public String getName() {
        return name;
    }

    public abstract String getType();

    @Override
    public int compareTo(Object animal){

        Pet pet = (Pet)animal;

        if(this.getName().equals(pet.getName()))
            return 0;
        else if(this.getName().compareTo(pet.getName()) < 0)
            return -1;
        else
            return 1;

    }




}
