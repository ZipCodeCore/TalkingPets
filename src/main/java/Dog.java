/**
 * Created by mollyarant on 5/6/17.
 */
public class Dog extends Pet{


    public Dog(String petName, String petType){
        super(petName, petType);
    }

    @Override
    public String speak(){
        String greeting = "Woof";
        return greeting;
    }
}
