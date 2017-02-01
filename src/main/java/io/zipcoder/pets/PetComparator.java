package io.zipcoder.pets;

import java.util.Comparator;

/**
 * @author John A. Squier
 */
public class PetComparator implements Comparator<Pet>
{
    public int compare(Pet p1, Pet p2)
    {
        if ( p1.getClass().getName().compareTo(p2.getClass().getName()) < 0 )
        {
            return -1;
        }
        else if ( p1.getClass().getName().compareTo(p2.getClass().getName()) == 0 )
        {
            if ( p1.getName().compareTo(p2.getName()) < 0 )
            {
                return -1;
            }
            else if ( p1.getName().compareTo(p2.getName()) == 0 )
            {
                return 0;
            }
            else // p1.getName().compareTo(p2.getName()) > 0
            {
                return 1;
            }
        }
        else // p1.getClass().getName().compareTo(p2.getClass().getName()) > 0
        {
            return 1;
        }
    }

    public boolean equals(Comparator<Pet> other)
    {
        Pet cat = new Cat();
        Pet cat2 = new Cat();
        Pet cat3 = new Cat();
        Pet dog = new Dog();
        cat.setName("A");
        cat2.setName("B");
        cat3.setName("A");
        dog.setName("A");

        if ( this.compare(cat, dog) == other.compare(cat, dog)
                && this.compare(dog, cat) == other.compare(dog, cat)
                && this.compare(cat, cat2) == other.compare(cat, cat2)
                && this.compare(cat, cat3) == other.compare(cat, cat3)
                && this.compare(cat2, cat) == other.compare(cat2, cat) )
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
