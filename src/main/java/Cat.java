/**
 * Created by danries on 1/31/17.
 */
public class Cat extends Pet{

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String speak(){
        return "Meow";
    }

}
