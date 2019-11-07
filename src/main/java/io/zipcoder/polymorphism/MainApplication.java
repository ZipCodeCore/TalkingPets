package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    public static void main(String [] args) {
        List<Pets> pets = new ArrayList();

        Logger logger = Logger.getLogger(MainApplication.class.getName());
        Scanner scan = new Scanner(System.in);

        logger.info("How many pets ? ");
        int numberOfPets = scan.nextInt();


        for(int i = 0; i < numberOfPets; i++){
            logger.info("What is the name of pet " + (i +1) + " ?");
            String name = scan.next();

            logger.info("What is the type of pet " + (i +1) + " ?");
            String type = scan.next();
            String correctedType = type.toLowerCase();

            if (correctedType.equals("dog")) {
               Pets pet = new Dog(name,type);
               pets.add(i,pet);
            }else if(correctedType.equals("cat")){
                Pets pet = new Cat(name,type);
                pets.add(i,pet);
            }else if(correctedType.equals("turtle")) {
                Pets pet = new Turtle(name, type);
                pets.add(i, pet);
            }else{
                Pets pet = new Pets();
                pets.add(i,pet);
            }
        }
        for(int i =0 ; i < pets.size(); i++ ){
            logger.info(pets.get(i).speak());
        }

    }
}
