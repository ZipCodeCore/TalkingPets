package io.zipcoder.polymorphism;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.Arrays;

public class Mediator {
    ArrayList<Pet> petList = new ArrayList<Pet>();

    public void handleInput() {
        UserInput input = new UserInput();
        int numberPets = input.getNumberOfPets();
        System.out.println(numberPets);

       for (int i=0; i < numberPets; i++){
            String petType = input.getPetType(i);
            String petName = input.getPetName();
            CreatePet newPet = new CreatePet();
            newPet.createPet(petList, petType, petName);
            System.out.println( petType + " " + petName + " created");
       }
        System.out.println();
    }

    public void handleOutputs() {
        Output output = new Output();
        output.petSpeak(petList);
        output.listSortedByName(petList);
        output.listSortedByType(petList);
    }

}
