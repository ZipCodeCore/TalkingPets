package humphrey.jeriah;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class PetGenerator {



    public Dog createDog(String name){
        Dog dog = new Dog();
        dog.setName(name);
        return dog;
    }

    public Cat createCat(String name){
        Cat cat = new Cat();
        cat.setName(name);
        return cat;
    }

    public Dino createDino(String name){
        Dino dino = new Dino();
        dino.setName(name);
        return dino;
    }




}



