package io.zipcoder.pets;

import com.sun.deploy.net.MessageHeader;

public class Pet {
    String name;

    public Pet() {
        this.name = "Pet Name";
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "Pet say word";
    }

}

