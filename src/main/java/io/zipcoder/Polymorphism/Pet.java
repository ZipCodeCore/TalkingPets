package io.zipcoder.Polymorphism;

/**
 * Created by aaronlong on 5/1/17.
 */
public class Pet implements Comparable<Pet> {
    private String name;
    private String specie;

    public Pet() {
    }

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

    public int compareTo(Pet o) {
        if (specie.equals(o.getSpecie())) {
            return name.compareTo(o.getName());
        } else return specie.compareTo(o.getSpecie());
    }
}






