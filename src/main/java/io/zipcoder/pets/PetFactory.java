package io.zipcoder.pets;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class PetFactory {
    public Pet makeAPet(String type, String name){
        switch(type){
            case "Dog": Dog dog = new Dog(name); return dog;
            case "Fox": Fox fox = new Fox(name); return fox;
            default: Cat cat = new Cat(name); return cat;
        }
    }
}
