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
        // this name alphabetically before other name
        if ( this.getName().compareTo(other.getName()) < 0 )
        {
            return -1;
        }
        // pet names the same, compare by pet type name
        else if ( this.getName().compareTo(other.getName()) == 0 )
        {
            // this type name alphabetically before other type name
            if ( this.getClass().getName().compareTo(other.getClass().getName()) < 0 )
            {
                return -1;
            }
            // names and type names identical
            else if ( this.getClass().getName().compareTo(other.getClass().getName()) == 0 )
            {
                return 0;
            }
            else // this.getClass().getName().compareTo(other.getClass().getName()) > 0
            {
                return 1;
            }
        }
        else // this.getName().compareTo(other.getName()) > 0
        {
            return 1;
        }
    }
}
