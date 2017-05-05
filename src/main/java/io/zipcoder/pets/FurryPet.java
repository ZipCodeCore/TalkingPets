package io.zipcoder.pets;


abstract class FurryPet extends Pet {
    boolean hasFleas;

    void setFleas() {
        hasFleas = !hasFleas;
    }

    boolean getFleas() {
        return hasFleas;
    }
}
