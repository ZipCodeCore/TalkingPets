package io.zipcoder.polymorphism;

import java.util.logging.Logger;


public class Pets {
    String petName;
    String petType;

    public Pets(){}
    public Pets(String petName, String petType){
        this.petName = petName;
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String speak(){ return "AnimalNoise"; }

    public String toString(){
        return petName + " " + petType;
    }

}
