package petsPolymorphism;

/**
 * Created by jennifermcginty on 5/5/17.
 */
public class Fish extends Pet {


    public Fish(String petName, String petType){
        super(petName, petType);
    }

    @Override
    public String speak(){
        String greeting = "Blurp";
        return greeting;
    }
}
