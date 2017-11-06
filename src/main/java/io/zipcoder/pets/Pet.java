package io.zipcoder.pets;

public  class Pet {

    private String name;
    private String speak;

    public Pet(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String speak(){
        return " ";
    }

}
