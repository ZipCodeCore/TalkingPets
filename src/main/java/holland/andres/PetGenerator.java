package holland.andres;

public class PetGenerator {

    public Pet createPet(String name, String type) {

        if (type.equalsIgnoreCase("cat"))
            return new Cat(name);
        else if (type.equalsIgnoreCase("dog"))
            return new Dog(name);
        else if (type.equalsIgnoreCase("dino"))
            return new Dino(name);
        else {
            return new Pet(name);
        }
    }
}