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

    @Override
    public int compareTo(Object o) {
        Pet pet = (Pet) o;
        int length = (name.length() > pet.getName().length()) ? name.length() : pet.getName().length();

        for (int i = 0; i < length; i++) {
            if (name.charAt(i) < pet.getName().charAt(i)) {
                return 1;
            }
            if (name.charAt(i) > pet.getName().charAt(i)) {
                return -1;
            }
        }
        length = (this.getClass().getSimpleName().length() > pet.getClass().getSimpleName().length()) ? this.getClass().getSimpleName().length() : pet.getClass().getSimpleName().length();
        for (int i = 0; i < length; i++) {
            if (this.getClass().getSimpleName().charAt(i) < pet.getClass().getSimpleName().charAt(i)) {
                return 1;
            }
            if (this.getClass().getSimpleName().charAt(i) < pet.getClass().getSimpleName().charAt(i)) {
                return -1;
            }
        }
        return 0;
    }
}



