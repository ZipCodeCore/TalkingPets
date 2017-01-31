package marwamilton;

/**
 * Created by mkulima on 1/31/17.
 */
public class Iguana extends Pet {

    public Iguana(String name){
        this.name = name;
    }

    String speak(){
        return "What a gwan!";
    }

    public String toString(){
        return " Kind: " + this.getClass().getName() +
                "\n Name: " + this.name +
                "\n Speak: " + speak();
    }
}
