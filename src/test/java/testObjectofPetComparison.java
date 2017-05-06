import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mollyarant on 5/6/17.
 */
public class testObjectofPetComparison {



    @Test
    public void testComparePetsIfSameType() {
        ObjectofPetComparison petCompare= new ObjectofPetComparison();
        Pet pet = new Cat("Nigel", "Cat");
        Pet pet2= new Cat("Harry", "Cat");

        //given
        int expectedResult=6;

        //when
        int actualResult= petCompare.compare(pet, pet2);

        //then
        assertEquals("This should return 6", expectedResult, actualResult);

    }

    @Test
    public void testComparePetsIfDifferentTypesIfFirstOccursSecond() {
        ObjectofPetComparison petCompare= new ObjectofPetComparison();
        Pet pet = new Dog("Nigel", "Dog");
        Pet pet2= new Cat("Harry", "Cat");

        //given
        int expectedResult=1;

        //when
        int actualResult= petCompare.compare(pet, pet2);

        //then
        assertEquals("This should return 1", expectedResult, actualResult);

    }

    @Test
    public void testCompareIfDifferentTypesWherePet1ComesFirst(){
        ObjectofPetComparison petCompare= new ObjectofPetComparison();
        Pet pet = new Cat("Larry", "Cat");
        Pet pet2 = new Fish ("Destroyer","Fish" );

        //given
        int expectedResult= -3;

        //when
        int actualResult= petCompare.compare(pet, pet2);

        //then
        assertEquals("This should return -1", expectedResult, actualResult);

    }


}
