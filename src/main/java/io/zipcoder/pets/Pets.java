package io.zipcoder.pets;

public class Pets {
    private String name;

    public Pets(String name){
        this.name = name;
    }
    public String name(){
        return name;
    }

    public String speak(){
        return "I'm a speaking pet!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

