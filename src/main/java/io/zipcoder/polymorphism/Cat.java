package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Cat extends Pet {

    public Cat() {
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }

    public String speak() {
      return "Meow!";
    }

    public Cat (String catsName){
        name = catsName;
    }

}
