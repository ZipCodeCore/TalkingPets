package io.zipcoder.pets;


public class Dog extends FurryPet {

    Dog() {
        hasFleas = true;
        setName("Fido");
    }

    @Override
    String speak() {
        return "woof woof";
    }
}
