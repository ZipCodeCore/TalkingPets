/**
 * Created by danries on 1/31/17.
 */
public class Pet implements Comparable<Pet> {

    @Override
    public int compareTo(Pet pet) {
        int compare = this.compareName(pet);

        if (compare == 0){
            compare = this.compareType(pet);
        }
        return compare;
    }

    public String name;

    public String getName() {
        return name;
    }

    public String speak(){
        return null;
    }

    public int compareName(Pet pet){
        return this.name.compareTo(pet.getName());
    }

    public int compareType(Pet pet){
        return this.getClass().getSimpleName().compareTo(pet.getClass().getSimpleName());
    }

}
