package io.zipcoder.pets;
import java.util.*;

/**
 * Created by leon on 11/6/17.
 */

public class MainApplication {
    public static void main(String[] args) {
        String petType, petName;
        ArrayList<Pet> petList = new ArrayList<Pet>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int petNum = scanner.nextInt();
        for (int i = 0; i < petNum; i++) {
            System.out.println("What kind of pet?");
            petType = scanner.next();
            System.out.println("What is the name?");
            petName = scanner.next();
            switch (petType.toLowerCase()) {
                case "dog":
                    petList.add(new Dog(petType, petName));
                    break;
                case "cat":
                    petList.add(new Cat(petType, petName));
                    break;
                case "bird":
                    petList.add(new Bird(petType, petName));
                    break;
                default:
                    System.out.println("No pet type is match. Please enter dog, cat or bird");
                    i--;
                    break;
            }
        }
        Collections.sort(petList);
        System.out.println("Using comparable:");
        for (Pet pet : petList) {
            System.out.println(pet.getName() + ":" + pet.speak());
        }
            Collections.sort(petList, new Compare());
        System.out.println("Using comparator:");
            for (Pet pet : petList) {
                System.out.println(pet.getName() + ":" + pet.speak());

            }
        }
    }
