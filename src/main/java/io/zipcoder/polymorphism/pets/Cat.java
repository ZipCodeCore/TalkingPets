package io.zipcoder.polymorphism.pets;

public class Cat extends Pet {

    private String catName;
    private String petType;

    public Cat (String name){
        this.catName = name;
        this.petType = "Cat";
    }

    public Cat(){
        super.setName("No name cat");
        super.setPetType("Cat");
    }

    public String speak(){
        return "meow";
    }


}
