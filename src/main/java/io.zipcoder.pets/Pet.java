package io.zipcoder.pets;

public abstract class Pet {

    private String petName;


    public Pet(String petName) {

        this.petName = petName;

    }

    public String speak() {

        return "";
    }

    public String getPetname() {

        return petName;
    }

    public void setPetName(String petName) {

        this.petName = petName;
    }


}
