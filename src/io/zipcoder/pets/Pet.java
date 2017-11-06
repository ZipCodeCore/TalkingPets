package io.zipcoder.pets;


public class Pet implements Comparable<Pet>{

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

    public int compareTo(Pet o) {
        if(this.getName().compareTo(o.getName())==0){
            return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
        }
        return this.getName().compareTo(o.getName());
    }
}
