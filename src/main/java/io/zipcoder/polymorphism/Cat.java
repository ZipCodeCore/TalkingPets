package io.zipcoder.polymorphism;

import com.sun.media.jfxmedia.logging.Logger;

public class Cat extends Pets{

    public Cat(String petName, String petType) {
        super(petName, petType);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
