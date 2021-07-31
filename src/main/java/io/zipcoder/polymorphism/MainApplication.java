package io.zipcoder.polymorphism;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        List<String> pets = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many many pets do you own?");
        Integer numOfPets = scanner.nextInt();
        while(pets.size() < numOfPets) {
            if (numOfPets <= 1) {
                System.out.println("What is your pet's name?");
                pets.add(scanner.next());
            } else {
                System.out.println("What are your pets' names?");
                pets.add(scanner.next());
            }
            System.out.println(Arrays.asList(pets));
        }

    }

}
