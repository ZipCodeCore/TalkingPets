package io.zipcoder.pets;

public class Pet {

    private String Name;

    public Pet(String name){
        this.Name = name;
    }

    public String speak(){
        String nosie = "some noise";
        return nosie;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
