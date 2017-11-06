package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.io.zipcoder.pets.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MainTest.class,
        CatTest.class,
        DogTest.class,
        ParrotTest.class
})

public class AllTests {
}
