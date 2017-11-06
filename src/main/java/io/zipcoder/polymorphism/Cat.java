package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public String speak() {
      return "Meow!";
    }

    public Cat (String catsName){
        name = catsName;
    }
}
