package io.zipcoder.pets;

public class Cat extends Pet {
    //private static final String name = "";
   public Cat(String type, String name) {
       super(type, name);
   }

    public String speak() {
        return "Meow!";
    }
}
