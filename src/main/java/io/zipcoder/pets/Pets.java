package io.zipcoder.pets;

public abstract class Pets {

     public abstract String speak();

     String name;

     public Pets(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public void setName(String newName) {
         name = newName;
     }



}
