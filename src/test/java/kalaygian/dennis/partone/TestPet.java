package kalaygian.dennis.partone;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by denniskalaygian on 5/7/17.
 */
public class TestPet {

    @Test
    public void testCompareToNames(){
        //Given
        Dog dog1 = new Dog();
        dog1.setName("Alfred");
        Dog dog2 = new Dog();
        dog2.setName("Jerry");
        //When
        int order = dog1.compareTo(dog2);
        //Then
        Assert.assertTrue("compareTo() is missorting the pets by name", order < 0);
    }

    @Test
    public void testCompareToClasses(){
        //Given
        Dog dog = new Dog();
        dog.setName("Spot");
        Cat cat = new Cat();
        cat.setName("Spot");
        //When
        int order = dog.compareTo(cat);
        //Then
        Assert.assertTrue("compareTo() is missorting the pets by class", order > 0);

    }
}
