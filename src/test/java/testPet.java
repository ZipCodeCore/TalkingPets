import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mollyarant on 5/6/17.
 */
public class testPet {

    @Test
    public void testPetSpeak() {
        Pet pet = new Pet("Indecisive Pet", "Pet");

        //given
        String expectedResult= "HELLO HUMAN!";

        //when
        String actualResult= pet.speak();

        //then
        assertEquals("This should return HELLO HUMAN!", expectedResult, actualResult);

    }

    @Test
    public void testCompareTo() {
        Pet pet = new Pet("Indecisive Pet", "Pet");

        //given
        int expectedResult=0;

        //when
        int actualResult= pet.compareTo(pet);

        //then
        assertEquals("This should return 0", expectedResult, actualResult);

    }


    @Test
    public void testCompareTwoPetsOfSameName() {
        Pet pet = new Dog("Henry", "Dog");
        Pet pet2= new Cat("Henry", "Cat");


        //given
        int expectedResult=1;

        //when
        int actualResult= pet.compareTo(pet2);

        //then
        assertEquals("This should return 1", expectedResult, actualResult);

    }

    @Test
    public void testCompareTwoPetsOfSameNameAndClass() {
        Pet pet = new Dog("Henry", "Dog");
        Pet pet2= new Dog("Henry", "Dog");


        //given
        int expectedResult=0;

        //when
        int actualResult= pet.compareTo(pet2);

        //then
        assertEquals("This should return 1", expectedResult, actualResult);

    }

    @Test
    public void testComparePetsFirstNameComesFirst() {
        Pet pet = new Dog("Henry", "Dog");
        Pet pet2= new Cat("Nigel", "Cat");


        //given
        int expectedResult=-6;

        //when
        int actualResult= pet.compareTo(pet2);

        //then
        assertEquals("This should return -6", expectedResult, actualResult);

    }

    @Test
    public void testComparePetsFirstNameComesSecond() {
        Pet pet = new Dog("Nigel", "Dog");
        Pet pet2= new Cat("Henry", "Cat");


        //given
        int expectedResult=6;

        //when
        int actualResult= pet.compareTo(pet2);

        //then
        assertEquals("This should return 6", expectedResult, actualResult);

    }


    @Test
    public void testComparePetsIfNamesSameButDifferentClassWithFirstClassComingFirst() {
        Pet pet = new Cat("Nigel", "Cat");
        Pet pet2= new Dog("Nigel", "Dog");

        //given
        int expectedResult=-1;

        //when
        int actualResult= pet.compareTo(pet2);

        //then
        assertEquals("This should return -1", expectedResult, actualResult);

    }

    @Test
    public void testComparePetsIfSameType() {
        Pet pet = new Cat("Nigel", "Cat");
        Pet pet2= new Cat("Harry", "Cat");

        //given
        int expectedResult=6;

        //when
        int actualResult= pet.compare(pet, pet2);

        //then
        assertEquals("This should return 6", expectedResult, actualResult);

    }

    @Test
    public void testComparePetsIfDifferentTypesIfFirstOccursSecond() {
        Pet pet = new Dog("Nigel", "Dog");
        Pet pet2= new Cat("Harry", "Cat");

        //given
        int expectedResult=1;

        //when
        int actualResult= pet.compare(pet, pet2);

        //then
        assertEquals("This should return 1", expectedResult, actualResult);

    }

    @Test
    public void testCompareIfDifferentTypesWherePet1ComesFirst(){
        Pet pet = new Cat("Larry", "Cat");
        Pet pet2 = new Fish ("Destroyer","Fish" );

        //given
        int expectedResult= -3;

        //when
        int actualResult= pet.compare(pet, pet2);

        //then
        assertEquals("This should return -1", expectedResult, actualResult);

    }







}
