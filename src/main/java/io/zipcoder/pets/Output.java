package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by prestonbattin on 1/31/17.
 */
public class Output {

    private Scanner sc;
    private static int numPets;
    private String typePet;
    private String petName;
    private Pet pet;
    List<String> listNames = new ArrayList<>(), listTypes = new ArrayList<>();


    public void setNumPets(int num){


        numPets = num;

    }

    public void setTypePet(String type){

        typePet = type;
    }

    public void setNameOfPet(String name){

        petName = name;
    }

    public int getNumPets() {
        return numPets;
    }

    public String getTypePet() {
        return typePet;
    }

    public String getName() {
        return petName;
    }

    public void setPet(String type, String name){

        switch(type){

            case "Dog":

                pet = new Dog(name);
                break;

            case "Cat":

                pet = (new Cat(name));
                break;

            case "Pig":

                pet = (new Pig(name));
                break;

                default:
                    System.out.println("You can store a Pig, Dog, or Cat");
        }

    }

    public Pet getPet() {
        return pet;
    }

    public void getPetTypesMenu(int i){

        sc = new Scanner(System.in);

            System.out.println("What type is pet: " + (i + 1));
            sc = new Scanner(System.in);

            listTypes.add(sc.nextLine());


    }

    public void getPetNamesMenu(int i){

        sc = new Scanner(System.in);


            System.out.println("What is your " + listTypes.get(i) + "s name?");

            listNames.add(sc.nextLine());

            setPet(listTypes.get(i), listNames.get(i));


        }
    }


