package io.zipcoder.pets;

public class Bird extends Pet{

    public Bird(String name){
        super.setName(name);
    }

    @Override
    public String Speak() {
        String speak = "Chrip chirp";
        return speak;
    }
}
