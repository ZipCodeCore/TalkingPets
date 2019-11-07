package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class PetsTest {
    Logger logger =  Logger.getLogger(PetsTest.class.getName());
    Scanner scan = new Scanner(System.in);
//    @Test
//    public void TestPet(){
//        List<Pets> pets = new ArrayList();
//        logger.info("How many pets ? ");
//        int numberOfPets = scan.nextInt();
//
//
//        for(int i = 0; i < numberOfPets; i++){
//            logger.info("What is the name of pet" + i +1 + " ?");
//            String name = scan.nextLine();
//            logger.info("What is the type of pet" + i +1 + " ?");
//            String type = scan.nextLine();
//            Pets pet = new Pets(name,type);
//            pets.add(i,pet);
//        }
//        for(int i =0 ; i < pets.size(); i++ ){
//            logger.info(String.valueOf(pets.get(i)));
//        }
//
//    }



    @Test
    public void TestPetConstructor() {
        String expectedName = "Bilbo";
        String expectedType = "cat";

        Pets pet = new Pets(expectedName, expectedType);

        String actualName = pet.getPetName();
        String actualType = pet.getPetType();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void speak() {
        Pets pet = new Pets("Bilbo", "cat");
        String expected = "AnimalNoise";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);
    }



}