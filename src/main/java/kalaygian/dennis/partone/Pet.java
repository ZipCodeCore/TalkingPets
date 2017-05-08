package kalaygian.dennis.partone;

/**
 * Created by denniskalaygian on 5/2/17.
 */
public abstract class Pet implements Comparable<Pet>{

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public abstract String speak();

    public int compareTo(Pet otherPet){
        if(!(getName().equals(otherPet.getName()))){
            return getName().compareTo(otherPet.getName());
        }
        int compareClass = getClass().getName().compareTo(otherPet.getClass().getName());
        return compareClass;
    }

}






