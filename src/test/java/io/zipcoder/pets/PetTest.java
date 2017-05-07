package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void DogSpeakTest() {
        //Given
        Pet p = new Dog("Champ");

        //When
        String actual = p.speak();

        //Then
        assertEquals("Dogs should bark", "Bark", actual);
    }

    @Test
    public void CatSpeakTest() {
        //Given
        Pet p = new Cat("Percival");

        //When
        String actual = p.speak();

        //Then
        assertEquals("Cats should meow", "Meow", actual);
    }

    @Test
    public void PigSpeakTest() {
        //Given
        Pet p = new Pig("Babe");

        //When
        String actual = p.speak();

        //Then
        assertEquals("Pigs typically oink", "Oink", actual);
    }

    @Test
    public void compareToTest(){

        //: Given
        Pet champ = new Dog("Champ");
        Pet yeppi = new Cat("Yeppi");

        //: When
        int actualResult = champ.compareTo(yeppi);

        //: Then
        assertTrue(actualResult < 0);

    }

    @Test
    public void compareTest(){

        //: Given
        Pet champ = new Dog("Champ");
        Pet yeppi = new Cat("Champ");
        PetComparator pc = new PetComparator();

        //: When
        int actualResult = pc.compare(champ, yeppi);

        //: Then
        assertTrue(actualResult > 0);

    }
}
