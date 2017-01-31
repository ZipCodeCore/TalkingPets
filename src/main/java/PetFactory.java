/**
 * Created by danries on 1/31/17.
 */
public class PetFactory {

    Cat cat;
    Dog dog;
    Snake snake;

    public Pet makeAPet(String name, String type){
        type = type.toLowerCase();
        Pet pet = new Pet();
        switch (type){
            case "cat":
                pet = new Cat(name);
                break;
            case "dog":
                pet = new Dog(name);
                break;
            case "snake":
                pet = new Snake(name);
        }
        return pet;
    }

}
