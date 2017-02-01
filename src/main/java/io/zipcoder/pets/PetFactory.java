package io.zipcoder.pets;
/**
 * Created by tolaniibikunle on 1/31/17.
 */
public class PetFactory {

    Pet pet ;

    public Pet makeAPet(String type,String name){
        // constructor from dog , cat , and cow should pass the name into this switch statement
       type = type.toLowerCase();
       switch(type){
           case "dog":
               pet = new Dog(name);
               break;

           case "cow":
               pet = new Cow(name);
               break;
           case "cat":
               pet = new Cat(name);
               break;
       }

       return pet;

    }

}
