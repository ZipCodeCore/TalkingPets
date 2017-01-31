package marwamilton;

/**
 * Created by mkulima on 1/31/17.
 */
public class Pet {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String speak(){
        return "Pet Speak!";
    }

    public String toString(){
        return " Kind: " + this.getClass().getName() + "\n Name: " + this.name + "\n Speak: " + speak();
    }
}
