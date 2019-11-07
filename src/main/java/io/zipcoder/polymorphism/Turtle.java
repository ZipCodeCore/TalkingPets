package io.zipcoder.polymorphism;

import javax.swing.event.AncestorEvent;

public class Turtle extends Pets {

    public Turtle(String petName, String petType) {
        super(petName, petType);
    }

    @Override
    public String speak() {
        return "Meowf";
    }
}
