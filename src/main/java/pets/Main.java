package pets;

import java.util.*;

/**
 * Created by cameronsima on 5/2/17.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("How many pets do you have?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int numPets = Integer.parseInt(input);
        String[] petNames = new String[numPets];
        String[] petTypes = new String[numPets];




        for (int i = 0; i < numPets; i++) {

            System.out.println("Enter the pet's type");
            String type = scanner.nextLine();
            petTypes[i] = type;
            System.out.println("Enter the name for pet " + (i+1));
            String name = scanner.nextLine();
            petNames[i] = name;

        }

        Pet[] pets = new Pet[petNames.length];

        for (int i = 0; i < petNames.length; i++) {
            if (petTypes[i].equals("cat")) {
                Cat cat = new Cat();
                cat.setName(petNames[i]);
                pets[i] = cat;
            } else {
                Dog dog = new Dog();
                dog.setName(petNames[i]);
                pets[i] = dog;
            }

        }

        for (Pet pet : pets) {
            System.out.println("My name is " + pet.getName() + " and I go " + pet.speak());
        }

    }
}
