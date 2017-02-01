import java.util.Comparator;

/**
 * Created by randallcrame on 1/31/17.
 */
public class Pet implements Comparable<Pet>{

    String name;

    Pet(){};

    Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "Remember to push often!";
    }

    @Override
    public int compareTo(Pet pet) {
        return (this.name).compareTo(pet.getName());
    }
}
