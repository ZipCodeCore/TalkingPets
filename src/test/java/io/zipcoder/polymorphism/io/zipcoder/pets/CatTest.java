package io.zipcoder.polymorphism.io.zipcoder.pets;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest extends PetsTest {

    public CatTest() {
        super(new Cat(), "Meow~", "Garfield");
    }
}