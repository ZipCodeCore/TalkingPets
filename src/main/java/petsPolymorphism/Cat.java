package petsPolymorphism;

/**
 * Created by jennifermcginty on 5/5/17.
 */
public class Cat extends Pet {

    public Cat(String petName, String petType){

        super(petName, petType);
    }

    @Override
    public String speak(){
        String greeting = "Meow";
        return greeting;
    }
}
