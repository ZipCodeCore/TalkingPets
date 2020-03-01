package io.zipcoder.polymorphism;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Hampster;
import io.zipcoder.pets.Pet;


import javax.crypto.spec.PSource;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        String petType, petName;
        ArrayList<Pet> petArrayList = new ArrayList<Pet>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();

        for(int i = 1; i <= numberOfPets; i++) {
            System.out.println("What kind of pet?");
            petType = scanner.next();
            System.out.println("Enter pet's name.");
            petName = scanner.next();
            if ("dog".equals(petType.toLowerCase())) {
                petArrayList.add(new Dog(petType, petName));
            } else if ("cat".equals(petType.toLowerCase())) {
                petArrayList.add(new Cat(petType, petName));
            } else if ("hampster".equals(petType.toLowerCase())) {
                petArrayList.add(new Hampster(petType, petName));
            }
        }
        for (Pet petObj : petArrayList) {
            System.out.println(petObj.getName() + " " + petObj.speak());

        }
    }
}
