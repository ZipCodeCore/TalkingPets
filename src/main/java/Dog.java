/**
 * Created by danries on 1/31/17.
 */
public class Dog extends Pet{


    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String speak(){
        return "Woof Woof";
    }

}
