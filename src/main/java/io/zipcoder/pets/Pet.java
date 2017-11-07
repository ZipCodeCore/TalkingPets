package io.zipcoder.pets;

import java.util.*;


public abstract class Pet implements Comparable<Pet>{

    public Pet(String name){
        this.name = name;
    }


    private String name ;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

      public abstract void speak ();


//    @Override
//    public int compareTo(Pet pet) {
//
//          String className = this.getClass().getName();
//          String petClassName  = pet.getClass().getName();
//          String petname = pet.getName();
//          String name = this.getName();
//
//
//          if (className.equals(petClassName))
//              return name.compareTo(petname);
//            else
//        return className.compareTo(petClassName);
//          }

    @Override
    public int compareTo(Pet pet) {

        String className = this.getClass().getName();
        String petClassName  = pet.getClass().getName();
        String petName = pet.getName();
        String name = this.getName();


        if (name.equals(petName))
            return className.compareTo(petClassName);
        else
            return name.compareTo(petName);
    }





        @Override
    public  String toString(){

          return this.getName();
        }

    }


