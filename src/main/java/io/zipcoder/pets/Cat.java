package io.zipcoder.pets;


public class Cat extends FurryPet {

    Cat() {
        hasFleas = false;
        setName("Dorothy");
    }

    @Override
    String speak() {
        return "meow";
    }
}
