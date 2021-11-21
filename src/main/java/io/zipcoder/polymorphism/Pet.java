package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Pet {
Integer age;
String name;
String breed;

ArrayList<Pet> pets = new ArrayList<Pet>();

public Pet(String name,String breed,Integer age){
    this.name = name;
    this.breed= breed;
    this.age = age;

}
public Pet(){}

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void removePet(Pet pet){
         pets.remove(pet);
    }

    public Integer numberOfPets(){
        return pets.size();
    }

    public String speak(){
        return "I am Not Going To Speak Until You tell what Pet i am";
    }

}
