package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Parrot extends Pet {

    public Parrot() {
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }

    public String speak(){
        return "Squawk!";
    }

    public Parrot (String parrotsName){
        name = parrotsName;
    }
}
