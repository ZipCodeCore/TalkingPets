package io.zipcoder.pets;

/**
 * @author John A. Squier
 */
abstract public class Pet
{
    protected String name;

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
