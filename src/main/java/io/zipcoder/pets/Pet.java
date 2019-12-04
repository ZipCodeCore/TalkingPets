package io.zipcoder.pets;

public abstract class Pet implements Animal {
    private String name;
    protected Pet(){}

    protected Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
