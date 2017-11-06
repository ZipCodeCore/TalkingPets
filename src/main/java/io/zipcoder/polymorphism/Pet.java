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
        int petName = this.getName().compareTo(o.getName());
        int petType = this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());

        if (petType == 0)
            return petName;
        else {
            return petType;
        }
    }
}

