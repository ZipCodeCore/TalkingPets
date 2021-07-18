package io.zipcoder.polymorphism;


public abstract class Pet implements Animal{

    private String name;
    private PetOwner owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(PetOwner newPetOwner) {

        this.owner=newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {

        return this.owner;
    }

    public String speak() {
        return "A man chooses, a slave obeys";
    }
}
