package io.zipcoder.pets;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CatTest.class,
        DogTest.class,
        SnakeTest.class
})

public class AllTests {
}

