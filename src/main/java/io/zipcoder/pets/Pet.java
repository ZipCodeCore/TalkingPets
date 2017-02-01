package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by alexandraarmstrong on 1/31/17.
 */
abstract public class Pet implements Comparable {

    String name;

    abstract public String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Pet pet) {
        return 0;
    }
}



