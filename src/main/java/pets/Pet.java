package pets;
import java.util.Comparator;

/**
 * Created by cameronsima on 5/2/17.
 */
public class Pet implements Comparable<Pet>{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "I'm a pet";
    }

    public int compareTo(Pet o) {
        if (this.getName().equals(o.getName())) {
            return this.getClass().toString().compareTo(o.getClass().toString());
        } else {
            return this.getName().compareTo(o.getName());
        }
    }
}