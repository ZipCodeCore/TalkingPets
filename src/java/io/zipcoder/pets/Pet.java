package io.zipcoder.pets;

public class Pet {

    private String Name;

    public Pet(String name){
        this.Name = name;
    }

    public String Speak(String speak){
        speak = "Some Noise";
        return speak;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
