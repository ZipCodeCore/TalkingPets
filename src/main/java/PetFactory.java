import java.util.*;

/**
 * Created by mollyarant on 5/6/17.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PetFactory {
        ArrayList<Pet> pets = new ArrayList();



        Scanner scanner = new Scanner(System.in);


        public Pet createPet() {
            System.out.println("What kind of pet?");
            String typeOfPet = scanner.next();


            System.out.println("What is your pet's name?");
            String nameOfPet = scanner.next();
            Pet pet = new Pet(nameOfPet,typeOfPet);

            if(typeOfPet.equals("Cat")){
                pet = new Cat(nameOfPet, typeOfPet);
            }
            else if (typeOfPet.equals("Dog")){
                pet = new Dog(nameOfPet, typeOfPet);
            }
            else if(typeOfPet.equals("Fish")){
                pet = new Fish(nameOfPet,typeOfPet);
            }

            return pet;

        }


        public Pet[] createPets() {
            System.out.println("How many pets would you like to create?");
            int numberOfPets = scanner.nextInt();
            Pet[] pets = new Pet[numberOfPets];
            for (int i = 0; i < numberOfPets; i++) {
                Pet newPet = createPet();
                pets[i] = newPet;
            }
            return pets;
        }

        /**
         * @param pet - the pet object to be added to the list
         */
        public void addPetToList(Pet pet) {
            String petType = pet.getPetType();
            String petName = pet.getPetName();
//            System.out.println("Adding a new pet to the list...");
//            System.out.println("The type of the pet is " + petType);
//            System.out.println("The name of the pet is " + petName);


            pets.add(pet);
        }

        public void addPetsToList(Pet[] pets){
            for (int i = 0; i < pets.length; i++) {
                addPetToList(pets[i]);
            }
        }



        public ArrayList<Pet> getPetList() {

            return pets;
        }


    }






