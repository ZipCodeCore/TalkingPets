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
    public void TestCatConstructor(){
        Cat cat = new Cat("Bilbo", "cat");

        logger.info(cat.toString());
    }

    @Test
    public void TestCatSpeak(){
        Cat cat = new Cat("Bilbo", "cat");

        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestDogConstructor(){
        Dog dog = new Dog("Frodo", "dog");

        logger.info(dog.toString());
    }

    @Test
    public void TestDogSpeak(){
        Dog dog = new Dog("Frodo", "dog");

        String expected = "Woof";
        String actual = dog.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestTurtleConstructor(){
        Turtle turtle = new Turtle("Gretchen", "turtle");

        logger.info(turtle.toString());
    }

    @Test
    public void TestTurtleSpeak(){
        Turtle turtle = new Turtle("Gretchen", "turle");

        String expected = "Meowf";
        String actual = turtle.speak();
        Assert.assertEquals(expected,actual);
    }

}