package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class CreatePet {

    /* method to createPet */
    public void createPet(ArrayList<Pet> petList, String petType, String petName) {
        if (petType.equals("dog")) {
            Dog dog = new Dog(petName);
            petList.add(dog);
        } else if (petType.equals("cat")) {
            Cat cat = new Cat(petName);
            petList.add(cat);
        } else if (petType.equals("bird")) {
            Bird bird = new Bird(petName);
            petList.add(bird);
        }
    }

}
