package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {
    MainApplication testApp = new MainApplication();

    @Test
    public void addPet() {

        testApp.getTypes(2);
        int expected = 2;
        int actual = testApp.setOfPets.length;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void printPets() {
//        testApp.addPet("Cat");
//        testApp.addPet("Dog");
//
//        String expected = "No name cat";
//        String actual = testApp.petList.get(0).getName();
//        Assert.assertEquals(expected,actual);
//
//        expected = "No name dog";
//        actual = testApp.petList.get(1).getName();
//        Assert.assertEquals(expected,actual);
    }

    // ****************************

    @Test
    public void getNumberOfPets() {
    }

    @Test
    public void getTypes() {
    }

    @Test
    public void getName() {
    }
}
