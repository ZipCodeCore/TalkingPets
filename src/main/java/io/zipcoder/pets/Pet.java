package io.zipcoder.pets;

/**
 * Created by alfatihmukhtar on 1/31/17.
 */
public abstract class Pet implements Comparable<Pet> {
    // FIELDS
    protected String name;
    protected String type;

    // CONSTRUCTORS
    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public Pet() {}

    // SETTERS
    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }

    // GETTERS
    public String getName() { return name; }
    public String getType() { return type; }

    // METHODS
    public abstract String speak();

    // OVERRIDES
    @Override
    public int compareTo(Pet pet) {
        return this.getName().compareTo(pet.getName());
    }
}
