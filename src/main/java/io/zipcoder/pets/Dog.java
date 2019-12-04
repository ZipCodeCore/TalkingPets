package io.zipcoder.pets;

public class Dog extends Pet {

    public Dog(){
        super("Clifford");
    }
    public Dog(String name) {
        super(name);
    }
    public String speak() {
        return "bow-wow";
    }
}
