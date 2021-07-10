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
            System.out.println("What are their names?" + "\n");
            for (int i = 0; i < listOfPets.size(); i++) {
                if (listOfPets.get(i) instanceof Cat) {
                    System.out.println("The name of your cat?");
                    listOfPets.get(i).setName(IO.namesOfPets());
                } else if (listOfPets.get(i) instanceof Dog) {
                    System.out.println("The name of your dog?");
                    listOfPets.get(i).setName(IO.namesOfPets());
                } else {
                    System.out.println("The name of your bird?");
                    listOfPets.get(i).setName(IO.namesOfPets());
                }
            }
            for (int i = 0; i < listOfPets.size(); i++) {
                if (listOfPets.get(i) instanceof Cat) {
                    System.out.println("Your cat, " + listOfPets.get(i).getName() +
                            ", wants to tell you " + listOfPets.get(i).speak());
                } else if (listOfPets.get(i) instanceof Dog) {
                    System.out.println("Your dog, " + listOfPets.get(i).getName() +
                            ", wants to tell you " + listOfPets.get(i).speak());
                } else {
                    System.out.println("Your bird, " + listOfPets.get(i).getName() +
                            ", wants to tell you " + listOfPets.get(i).speak());
                }
            }
        }
    }
}

