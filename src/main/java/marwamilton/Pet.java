package marwamilton;

/**
 * Created by mkulima on 1/31/17.
 */
public class Pet implements Comparable<Pet>{
    String name;
    String type;

    public Pet(String name){
        this.name = name;
    }

    public Pet(){

    }

    public String getName() {
        return name;
    }

    String speak(){
        return "Pet Speak!";
    }

    public String toString(){
        return " Kind: " + this.getClass().getSimpleName() + "\n Name: " + this.name + "\n Speak: " + speak();
    }

    // default compareTo implementation
    public int compareTo(Pet otherPet){
        return compareNameThenKind(otherPet);
    }

    // alternative compareTo implementation that takes in an int to denote whether to
    // first use names or pet kinds
    public int compareTo(Pet otherPet, int compareType){
        if (compareType==0) {
            return compareNameThenKind(otherPet);
        } else
            return compareKindThenName(otherPet);

    }

    public int compareKindThenName(Pet otherPet){
        if(compareKind(otherPet) == 0)
            return compareName(otherPet);
        else
            return compareKind(otherPet);
    }

    public int compareNameThenKind(Pet otherPet){
        if(compareName(otherPet) == 0)
            return compareKind(otherPet);
        else
            return compareName(otherPet);
    }

    private int compareName(Pet otherPet){
        return this.name.compareTo(otherPet.getName());
    }

    private int compareKind(Pet otherPet){
        return this.getClass().getSimpleName().compareTo(otherPet.getClass().getSimpleName());
    }
}
