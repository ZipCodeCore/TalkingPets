package io.zipcoder.polymorphism;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class MainApplication {

    public static void main(String[] args) {
        addPet();
    }

    public static void addPet() {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        int numOfPets = getInt("How many pets do you have?");
        for (int x = 1; x <= numOfPets; x++) {
            String petType = getPetType();
            Class<?> clazz = validateClassName(petType);
            String petName = getString("What is the name of your pet?");
            Pet aPet = createPet(clazz, petName);
            pets.add(aPet);
        }

        Collections.sort(pets);

        for (int x = 0; x < pets.size(); x++) {
            System.out.println(pets.get(x).getName() + " says: " + pets.get(x).speak());
        }


    }

    private static Pet createPet(Class<?> clazz, String name) {
        Pet pet = null;
        try {
            Constructor<?>[] constructors = clazz.getConstructors();
            Object object = constructors[0].newInstance(name);
            pet = (Pet) object;
        } catch (InstantiationException | IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return pet;
    }

    private static Class<?> validateClassName(String petName) {
        Class<?> clazz;
        try {
            clazz = Class.forName(petName);
            if (clazz.getSimpleName().equals("Pet")) {
                Exception e = new Exception();
                throw e;
            }
        } catch (Exception e) {
            System.out.println("Invalid class name. Please re-enter.");
            petName = getPetType();
            clazz = validateClassName(petName);
        }
        return clazz;
    }

    private static String getPetType() {
        String packageName = "io.zipcoder.polymorphism.";
        String petType = getString("What type of pet do you have? (Cat, Dog, Goat)");
        petType = petType.trim();
        petType = petType.substring(0, 1).toUpperCase() + petType.substring(1).toLowerCase();
        return packageName + petType;
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int getInt(String prompt) {
        return Integer.parseInt(getString(prompt));
    }
}
