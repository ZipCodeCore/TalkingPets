package io.zipcoder.polymorphism;
import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pets;
import java.util.ArrayList;
import java.util.List;

public class Console {

    List<Pets> listOfPets = new ArrayList<>();
    private static Integer counter = 0;

    public void run() {
        System.out.println("Hello there! How many pets do you have?");
        Integer amountOfPets = IO.numberOfPets();
        while (counter < amountOfPets) {
            for (int i = 0; i < amountOfPets; i++) {
                counter++;
                System.out.println("What kind of pet do you have?");
                System.out.println("1. Cat" + "\n" + "2. Dog" + "\n" + "3. Bird");
                switch (IO.chooseThePet()) {
                    case 1 :
                        listOfPets.add(i, new Cat());
                        break;
                    case 2 :
                        listOfPets.add(i, new Dog());
                        break;
                    case 3 :
                        listOfPets.add(i, new Bird());
                        break;
                }
            }
        }
        assigningNames();
        assigningAges();
        System.out.println("Wow! You have " + listOfPets.size() + " pets?! That's a lot!" +
                "\n" + "Thank you for telling me about..." + "\n");
        printingTheList();
    }
    public void assigningNames () {
        System.out.println("What are their names?" + "\n");
        for (Pets listOfPet : listOfPets) {
            if (listOfPet instanceof Cat) {
                System.out.println("The name of your cat?");
                listOfPet.setName(IO.namesOfPets());
            } else if (listOfPet instanceof Dog) {
                System.out.println("The name of your dog?");
                listOfPet.setName(IO.namesOfPets());
            } else {
                System.out.println("The name of your bird?");
                listOfPet.setName(IO.namesOfPets());
            }
        }
    }
    public void printingTheList () {
        for (Pets listOfPet : listOfPets) {
            if (listOfPet instanceof Cat) {
                System.out.println("Your cat, " + listOfPet.getName() + ", who is " + listOfPet.getAge() +
                        " years old, wants to tell you " + listOfPet.speak());
            } else if (listOfPet instanceof Dog) {
                System.out.println("Your dog, " + listOfPet.getName() + ", who is " + listOfPet.getAge() +
                        " years old, wants to tell you " + listOfPet.speak());
            } else {
                System.out.println("Your bird, " + listOfPet.getName() + ", who is " + listOfPet.getAge() +
                        " years old, wants to tell you " + listOfPet.speak());
            }
        }
    }
    public void assigningAges () {
        System.out.println("What are their Ages?" + "\n");
        for (Pets eachPet : listOfPets) {
            System.out.println("How old is " + eachPet.getName() + "?");
            eachPet.setAge(IO.thePetsAge());
        }
    }
}

