package io.zipcoder.polymorphism;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import io.zipcoder.pets.Platypus;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {

    @Test
    public void printPetListTest() {
        //Given
        Integer numberOfPets = 3;
        String[] typeOfPets = {"Cat", "Dog", "Platypus"};
        String[] petNames = {"Luna", "Bruno", "Ben"};

        String expected = "Cat Luna\nDog Bruno\nPlatypus Ben\n";
        String actual = MainApplication.printPetList(numberOfPets, typeOfPets, petNames);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void petSpeaksTest() {

        Cat cat = new Cat("Mittens");
        Dog dog = new Dog("Aika");
        Platypus platypus = new Platypus("Sam");
        Pet[] pets ={cat,dog,platypus};

        String expected = "Mittens the cat says\n\tmeow ~\nAika the dog says\n\tbow-wow\nSam the platypus says\n\tPerry the platypus noises";
        String actual = MainApplication.petSpeaks(pets);
        Assert.assertEquals(expected, actual);

    }

}
