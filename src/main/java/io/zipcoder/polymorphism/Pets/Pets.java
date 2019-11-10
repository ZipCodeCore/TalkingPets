package io.zipcoder.polymorphism.Pets;

public abstract class Pets {

    private String name;
    //private String type;

    public abstract String speak();

    public Pets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String[] className;
        className = this.getClass().getName().split("\\.");

        return String.format("\n%s is a %s and sounds like %s",
                this.getName(), className[className.length - 1], this.speak());
    }

}
