package io.zipcoder.polymorphism.Pets;

public class Dog extends Pets {

    public Dog(String name) {
        super(name);
    }

    public Dog(){
        super("Dingo");
    }

    public String type(){
        return "Dog";
    }

    @Override
    public String speak() {
        return "woof!";
    }
}
