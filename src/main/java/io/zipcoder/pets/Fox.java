package io.zipcoder.pets;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
public class Fox extends Pet{

    Fox(String name){
        super.setName(name);
    }

    @Override
    public String speak(){
        int random = (int) (Math.ceil(Math.random() * 4));
        switch(random){
            case 1: return "Gering-ding-ding-ding-dingeringeding!";
            case 2: return "Wa-pa-pa-pa-pa-pa-pow!";
            case 3: return "Hatee-hatee-hatee-ho!";
            case 4: return "Joff-tchoff-tchoffo-tchoffo-tchoff!";
            default: return "How did you even get here?";
        }
    }

}
