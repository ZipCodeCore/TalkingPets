package io.zipcoder.pets;

/**
 * Created by aaronlong on 5/1/17.
 */
public class Pet {
    private String name;
    private String specie;

    public Pet() {}

    public Pet(String petName, String petSpecie) {
        name = petName;
        specie = petSpecie;
    }

    public void setName(String petName) {
        name = petName;
    }

    public String getName() {
        return name;
    }

    public void setSpecie(String animalSpecie) {
        specie = animalSpecie.toLowerCase();
    }

    public String getSpecie() {
        return specie;
    }

    public String speak() {
        return String.format("I am a %s", specie);
    }
}

class Dog extends Pet {
    public Dog() {}
    public Dog(String petName) {
        super(petName, "dog");
    }

    @Override
    public String speak() {
        return "I bark";
    }
}

class Cat extends Pet {
    public Cat() {}
    public Cat(String petName) {
        super(petName, "cat");
    }

    @Override
    public String speak() {
        return "I meow";
    }
}

class Bird extends Pet {
    public Bird() {}
    public Bird(String petName) {
        super(petName, "bird");
    }

    @Override
    public String speak() {
        return "I sing";
    }
}
