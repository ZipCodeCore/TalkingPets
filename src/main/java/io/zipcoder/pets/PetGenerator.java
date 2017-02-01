package io.zipcoder.pets;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class PetGenerator {
    static Pet createPet(String name, String type) {
        if(type.equalsIgnoreCase("cat"))
            return new Cat(name);
        if(type.equalsIgnoreCase("dog"))
            return new Dog(name);
        if(type.equalsIgnoreCase("dino"))
            return new Dino(name);
        else
            return new Pet(name);
    }

}
