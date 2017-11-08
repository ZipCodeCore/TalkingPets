package io.zipcoder.polymorphism;

import io.zipcoder.pets.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.Comparator;

public class ComparableTest {

    @Test
    public void testComparablePet()
    {
        Pet pet1 = new Dog("Rufus");
        Pet pet2 = new Snake("Rufus");

        if ( !pet1.getName().equals(pet2.getName()))
        {
            Assert.assertEquals(pet1.getName().compareTo(pet2.getName()), pet1.compareTo(pet2));
        }
        else
        {
            Assert.assertEquals(pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName()), pet1.compareTo(pet2));
        }
    }

    @Test
    public void testComparatorPet()
    {
        Pet pet1 = new Dog("Rufus");
        Pet pet2 = new Dog("LtCdrWoof");
        Pet pet3 = new Cat("Rufus");
        Pet pet4 = new Snake("LtCdrWoof");
        Pet pet5 = new Cat("Rufus");

        Comparator<Pet> comp = (p1, p2) ->{
            String pet1Type = p1.getClass().getSimpleName();
            String pet2Type = p2.getClass().getSimpleName();
            return( pet1Type.equals(pet2Type) ? p1.compareTo(p2) : pet1Type.compareTo(pet2Type) );
        };

        Assert.assertNotEquals(0,comp.compare(pet1, pet2));
        Assert.assertNotEquals(0,comp.compare(pet1, pet3));
        Assert.assertNotEquals(0,comp.compare(pet1, pet4));
        Assert.assertNotEquals(0,comp.compare(pet1, pet5));
        Assert.assertNotEquals(0,comp.compare(pet2, pet3));
        Assert.assertNotEquals(0,comp.compare(pet2, pet4));
        Assert.assertNotEquals(0,comp.compare(pet2, pet5));
        Assert.assertNotEquals(0,comp.compare(pet3, pet4));
        Assert.assertEquals(0,comp.compare(pet3, pet5));
        Assert.assertNotEquals(0,comp.compare(pet4, pet5));

    }

}
