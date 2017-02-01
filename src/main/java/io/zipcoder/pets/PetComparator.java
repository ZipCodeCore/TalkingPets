package io.zipcoder.pets;

import java.util.Comparator;

/**
 * @author John A. Squier
 */
public class PetComparator implements Comparator<Pet>
{
    public int compare(Pet p1, Pet p2)
    {
        return -1000;
    }

    public boolean equals(Object o)
    {
        return false;
    }
}
