package io.zipcoder.pets;

public class Pet {
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String type;
    private String name;
    public Pet(String type, String name){
        this.type = type;
        this.name = name;
    }
    public String speak(){
        return " ";
    }
}
