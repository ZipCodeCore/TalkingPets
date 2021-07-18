package io.zipcoder.polymorphism;
import java.util.Scanner;

public class Console {
    public static void print(String input) {
        System.out.println(input);
    }

    public static void run(Scanner scanner,Integer noOfPets) {
        Pet[] pets = findTypeNameOfPet(scanner, noOfPets);
        System.out.println(petSpeaks(pets));
    }

    public static Pet[] findTypeNameOfPet(Scanner scanner,Integer noOfPets) {
            String[] typeOfPets = new String[noOfPets];
            String[] petNames = new String[noOfPets];
            Pet[] pets=new Pet[noOfPets];
            for (Integer index = 0; index < noOfPets; index++) {
                System.out.println("What kind of pet is pet " + (index + 1) + "?");
                Pet pet = createPet(scanner.next());
                System.out.println("What is the the name of pet " + (index + 1) + "?");
                pet.setName(scanner.next());
                pets[index] = pet;
            }
            return pets;
        }


    private static Pet createPet(String petType){
        if(petType.equals("dog"))
            return new Dog();
        else if(petType.equals("cat"))
            return new Cat();
        else if(petType.equals("rabbit"))
            return new Rabbit();
        else
            return null;
    }

    public static String petSpeaks(Pet[] pets) {
        String result = "";

        for(Pet pet: pets)
            result += String.format("%s the %s says\t%s\n",
                    pet.getName(), typeOfPetInString(pet), pet.speak());


        return result.substring(0,result.length()-1);
    }

    private static String typeOfPetInString(Pet pet){
        if(pet instanceof Cat)
            return "cat";
        else if (pet instanceof Dog)
            return "dog";
        else if (pet instanceof Rabbit)
            return "rabbit";
        else
            return null;
    }
}

