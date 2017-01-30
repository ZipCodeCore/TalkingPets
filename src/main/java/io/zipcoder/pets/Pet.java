package io.zipcoder.pets;

/**
 * @author Mawolfe87
 * Created by John A. Squier for Michael Wolfe to implement
 */
abstract public class Pet
{
    private String name;

    public Pet() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void speak();

    public int getNumberOfPetsUserHas()
    {
        return -1;
    }

    public String getTypeOfPetUserHas()
    {
        return null;
    }

    public String getNameOfPetUserHas()
    {
        return null;
    }

    public String generateListOfPetsAsString()
    {
        return null;
    }
}
