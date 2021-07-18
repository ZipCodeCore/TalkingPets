package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApplicationTest {
@Test
    public void testMe(){
    //given
    String input = "4";
    Integer expected = 4;

    //when
    MainApplication app = new MainApplication();
    Integer value = app.getValue(input);

    //then
    Assert.assertEquals(expected, value);

    }

    @Test
    public void printListTest(){
    //given
    Pet pet1 = new Pet("Lola");
    Pet pet2 = new Pet ("Bromley");
    Pet pet3 = new Pet("Sammie");
    ArrayList<Pet> petList = new ArrayList<>();

    //when
    petList.add(pet1);
    petList.add(pet2);
    petList.add(pet3);
    String pet1Name = petList.get(0).getName();
    String sound = petList.get(0).speak();

    //then
    Assert.assertEquals("Lola", pet1Name);
    Assert.assertEquals("screech", sound);

    }

    @Test
    public void printTest2(){
    //given
        Pet pet1 = new Pet("Lola");
        Pet pet2 = new Pet ("Bromley");
        Pet pet3 = new Pet("Sammie");
        MainApplication app = new MainApplication();

        //when
        app.petList.add(pet1);
        app.petList.add(pet2);
        app.petList.add(pet3);

        //then
        String print = app.printList();
        System.out.println(print);
    }

    @Test
    public void addPetTest(){
        //given
        String name = "Scabbers";
        MainApplication app = new MainApplication();
        int expected = 1;

        //when
        app.addPet(name);
        int actual = app.getSize();

        //then
        Assert.assertEquals(expected, actual);
    }
}
