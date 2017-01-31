package io.zipcoder.pets;

/**
 * @author John A. Squier
 */
public class PetFactory implements CanCreatePets
{
    public Pet createPet(String petType)
    {
        switch( petType.toLowerCase() )
        {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "pig":
                return new Pig();
            default:
                return new Dog();
        }
    }
}
