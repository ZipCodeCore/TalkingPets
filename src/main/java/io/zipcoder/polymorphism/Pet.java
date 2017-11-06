package io.zipcoder.polymorphism;

public abstract class Pet implements Comparable<Pet>{
    private String name;
    public abstract String speak();

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pet o) {
        if (this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName()) == 0)
            return this.getName().compareTo(o.getName());
        else {
            return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
        }
    }
}

