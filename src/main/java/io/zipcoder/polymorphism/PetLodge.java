package io.zipcoder.polymorphism;

import io.zipcoder.Console;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Fish;
import io.zipcoder.pets.Pets;

public class PetLodge {

    public PetLodge() {}

    private Pets[] pets;
    public PetLodge(Integer numOfPets, String[] petNames, String[] petTypes){
        this.pets = createPets(numOfPets, petNames, petTypes);
    }

    public Pets[] createPets(Integer numOfPets, String[] petNames, String[] petTypes){
        Pets[] pets = new Pets[numOfPets];
        for(int i = 0; i < numOfPets; i++){
            pets[i] = createPetFromType(petNames[i], petTypes[i]);
        }
        return pets;
    }

    public Pets createPetFromType(String petName, String petType) {
        Pets pet;
        if (petType.equals("dog")) {
            pet = new Dog(petName);
        }
        else if (petType.equals("cat")) {
            pet = new Cat(petName);
        }
        else if (petType.equals("fish")) {
            pet = new Fish(petName);
        }
        else{
            pet = new Fish(petName);
        }
        return pet;
    }

    public void displayPetInfo(){
        Console.println("You got %s pets!", pets.length);

        for(int i = 0;  i< pets.length; i++){
            Console.println("Pet %s is a %s named %s! %s", i+1, pets[i].getType(), pets[i].getName(), pets[i].speak());
        }
    }

    public Pets[] getPets() {
        return this.pets;
    }
}
