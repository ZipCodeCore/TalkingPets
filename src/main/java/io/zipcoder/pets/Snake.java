package io.zipcoder.pets;

public class Snake extends Pet{

    private String speech;

    public Snake(String name){
        super(name);
        this.speech = "Parseltongue";
    }

    public String speak(){
        return this.speech;
    }


}
