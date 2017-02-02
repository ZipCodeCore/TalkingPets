/**
 * Created by randallcrame on 1/31/17.
 */
public class PetGenerator {

    public Pet createPet(String name, String kind){
        switch(kind.toLowerCase()){
            case "dog": return new Dog(name);
            case "cat": return new Cat(name);
            case "dino": return new Dino(name);
            default:return new Pet(name);
        }
    }
}
