package io.zipcoder.pets;

public class Pet {

    private String name = "";

    public Pet(){
        this.name = "Pet";
    }

    public Pet(String name){
        this.name = name;
    }

    public String speak(){

        String output = "I am not your 'buddy,' pal.";
        return output;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
