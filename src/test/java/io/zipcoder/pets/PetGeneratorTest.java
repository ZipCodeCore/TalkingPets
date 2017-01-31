package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/31/17.
 */
public class PetGeneratorTest {
    PetGenerator petGenerator = new PetGenerator();

    @Test
    public void createPetTest() {
        assertEquals("Cat expected", Cat.class, petGenerator.createPet("fluffy", "cat").getClass());
    }