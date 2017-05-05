package io.zipcoder.pets;


abstract class Pet implements Comparable<Pet> {
    private String name;

    abstract String speak();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Pet other) {
        int result = this.getName().compareTo(other.getName());
        if(result != 0) {
            return result;
        } else {
            return this.getClass().getName().compareTo(other.getClass().getName());
        }
    }

}
