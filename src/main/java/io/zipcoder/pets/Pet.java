package io.zipcoder.pets;

/**
 * Created by prestonbattin on 1/30/17.
 */
public abstract class Pet {

   private String name;

   Pet(String name){

       this.name = name;
   }

   public abstract String speak();

    public String getName() {
        return name;
    }

    public abstract String getType();

}
