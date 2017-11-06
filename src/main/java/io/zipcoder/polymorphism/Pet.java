package io.zipcoder.polymorphism;

public abstract class Pet {
    static String name;
    static String type;

    public Pet() {}

    public String speak(String type , String speech){
        return ( name + " is a " + type +  " and it goes " + speech + " !");
    }

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
