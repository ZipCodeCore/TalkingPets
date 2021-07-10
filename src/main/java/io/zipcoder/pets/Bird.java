package io.zipcoder.pets;

public class Bird extends Pets {

    public Bird () {
        this.name = "Alfred";
    }

    @Override
    public String speak() {
        return "Tweet";
    }


}
