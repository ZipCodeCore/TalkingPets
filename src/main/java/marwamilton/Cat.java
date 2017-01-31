package marwamilton;

/**
 * Created by mkulima on 1/31/17.
 */
public class Cat extends Pet{

    //
    public Cat(String name){
        this.name = name;
    }

    @Override
    String speak(){
        return "Meow! Meow!";
    }

}
