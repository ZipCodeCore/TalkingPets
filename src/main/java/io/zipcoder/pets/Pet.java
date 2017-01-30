package io.zipcoder.pets;

/**
 * @author Mawolfe87
 * Created by John A. Squier for Michael Wolfe to implement
 */
abstract public class Pet
{
    protected String name;

    public Pet() {}

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    abstract public String speak();
}
