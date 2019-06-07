package io.zipcoder.polymorphism;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Comparator;

public class Bird extends Pet{

    public Bird(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "Chirp!";
    }

    public int compareTo(Pet o){
        return this.getName().compareTo(o.getName());
    }



//    public static Comparator<Pet> petNameComparator
//            = new Comparator<Pet>() {
//
//        public int compare(Pet pet1, Pet pet2) {
//
//            String petName1 = pet1.getName().toUpperCase();
//            String petName2 = pet2.getName().toUpperCase();
//
//            //ascending order
//            return petName1.compareTo(petName2);
//
//            //descending order
//            //return petName2.compareTo(petName1);
//        }
//
//    };


    }
