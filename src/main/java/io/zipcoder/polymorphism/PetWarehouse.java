package io.zipcoder.polymorphism;

public class PetWarehouse {
    private Pet[] pets;

    public PetWarehouse(Pet... pets) {
        this.pets = pets;
    }
    public PetWarehouse(Integer numberOfPets, String[] petTypes, String[] petNames) {
        this.pets = createPets(numberOfPets, petTypes, petNames);
    }

    public Pet[] createPets(Integer numberOfPets, String[] petTypes, String[] petNames) {
        Pet[] pets = new Pet[numberOfPets];
        for (int i = 0; i < numberOfPets; i++) {
            pets[i] = createPetFromType(petTypes[i], petNames[i]);
        }
        return pets;
    }

    public Pet createPetFromType(String petType, String petName) {
        Pet pet;
        if (petType.equals("dog")) {
            pet = new Dog(petName);
        }
        else if (petType.equals("cat")) {
            pet = new Cat(petName);
        }
        else if (petType.equals("bird")) {
            pet = new Bird(petName);
        }
        else if (petType.equals("snake")) {
            pet = new Snake(petName);
        }
        else {
            pet = new UnknownPet(petName, petType);
        }
        return pet;
    }

    public Pet[] getPets() {
        return this.pets;
    }

    public void displayPetInfo() {
        Console.println("\n\n\n");
        Console.println("You have %s pets.", pets.length);

        for (int i = 0; i < pets.length; i++) {
            Console.println("Pet %s is a %s named %s.", i+1, pets[i].getType(), pets[i].getName());
            pets[i].speak();
        }
    }
}
