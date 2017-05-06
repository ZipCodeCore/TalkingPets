/**
 * Created by mollyarant on 5/6/17.
 */
public class Cat extends Pet{

    public Cat(String petName, String petType){
        super(petName, petType);
    }

    @Override
    public String speak(){
        String greeting = "Meow";
        return greeting;
    }

}
