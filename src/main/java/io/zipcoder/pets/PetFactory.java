package io.zipcoder.pets;

/**
 * Created by gillianreynolds-titko on 1/31/17.
 */
public class PetFactory {

    //This class will create instances of Pets

    String type;
    String name;

    PetFactory(String petType, String petName){
        this.type = petType;
        this.name = petName;
    }

    public Pet makeAPet(String petType, String petName){

        switch (petType) {
            case "Cat":
                Cat cat = new Cat(petName);
                return cat;
            case "Dog":
                Dog dog = new Dog(petName);
                return dog;
            case "Snake":
                Snake snake = new Snake(petName);
                return snake;
            default:
                return null;
        }
    }
}
