package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Dog extends Pet{

//    public Dog() {
//        Scanner scanner = new Scanner(System.in);
//        name = scanner.nextLine();
//    }

    public String speak(){
        return "Woof!";
    }

    public Dog (String dogsName){
        name = dogsName;
    }


}
