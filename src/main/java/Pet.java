import java.util.Comparator;

/**
 * Created by mollyarant on 5/6/17.
 */




public class Pet implements Comparable<Pet> {

    String petName;
    String petType;

    public Pet(String petName, String petType) {
        this.petName = petName;
        this.petType = petType;

    }


    public String getPetName() {
        return petName;
    }


    public void setPetName() {
        this.petName = petName;
    }


    public String getPetType() {
        return petType;
    }


    public void setPetType() {
        this.petType = petType;
    }


    public String speak() {
        String greeting = "HELLO HUMAN!";
        return greeting;
    }

    public int compareTo
            (Pet o) {
        if(this.petName.equals(o.getPetName())){
            int compareClass = this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
                return compareClass;
        }
        else{
            return this.petName.compareTo(o.getPetName());


        }
    }



    }

