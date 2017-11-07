package io.zipcoder;

import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;


public class ApplicationTest {

    Cat cat = new Cat("myCat");


    @Test
    public void getNameTest() {


        String expected = "myCat";

        String actual = cat.getName();

        Assert.assertEquals("The two cat names are equal", expected, actual);
    }

    @Test
    public void setnametest() {

        cat.setName("NotMycat");

        String expected = "NotMycat";
        String actual = cat.getName();

        Assert.assertEquals("name are equal", expected, actual);
    }


    @Test
    public void speakTest() {


        String expected = "miaw";

        cat.speak();


    }

//    @Test
//    public void compareToTest() {
//        ArrayList<Pet> pets = new ArrayList<>();
//
//
//        Cat cat = new Cat("ghi");
//        Dog dog = new Dog("mno");
//        Cat cat2 = new Cat("jkl");
//        Dog dog2 = new Dog("pqr");
//        Bird bird = new Bird("def");
//        Bird bird2 = new Bird("abc");
//
//        pets.add(bird2);
//        pets.add(dog);
//        pets.add(cat);
//        pets.add(dog2);
//        pets.add(bird);
//
//        pets.add(cat2);
//
//        System.out.println(pets.toString());
//
//        String expected = "[abc, def, ghi, jkl, mno, pqr]";
//
//        Collections.sort(pets);
//
//        String actual = pets.toString();
//
//        Assert.assertEquals("the arraylist is sorted", expected, actual);
//
//
//    }

        @Test
        public void compareToTest () {
            ArrayList<Pet> pets = new ArrayList<>();


            Cat cat = new Cat("aaa");
            Dog dog = new Dog("abc");
            Cat cat2 = new Cat("jkl");
            Dog dog2 = new Dog("aaa");
            Bird bird = new Bird("def");
            Bird bird2 = new Bird("abc");
            pets.add(bird2);
            pets.add(dog);
            pets.add(cat);
            pets.add(dog2);
            pets.add(bird);

            pets.add(cat2);

            System.out.println(pets.toString());

            String expected = "[aaa, aaa, abc, abc, def, jkl]";

            Collections.sort(pets);

            String actual = pets.toString();

            Assert.assertEquals("the arraylist is sorted", expected, actual);


        }

    }