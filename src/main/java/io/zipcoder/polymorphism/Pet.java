package io.zipcoder.polymorphism;

public abstract class Pet {
    private static String name;
    private static String type;

    public Pet() {}

    public abstract String speak();

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Pet.name = name;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Pet.type = type;
    }


}
