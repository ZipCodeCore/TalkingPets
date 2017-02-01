package io.zipcoder.pets;

/**
 * @author John A. Squier
 */
abstract public class Pet implements Comparable<Pet>
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    abstract public String speak();

    public int compareTo(Pet other)
    {
        return 500;
    }
}
