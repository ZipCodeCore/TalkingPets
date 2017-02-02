package marwamilton;

/**
 * Created by mkulima on 1/31/17.
 */
public class Dog extends Pet{

    public Dog(String name){
        this.name = name;
    }

    String speak(){
        return "Woof! Woof!";
    }

}
