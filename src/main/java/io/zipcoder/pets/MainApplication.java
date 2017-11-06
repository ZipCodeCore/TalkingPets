package io.zipcoder.pets;
import java.util.*;


/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        String petType,petName;
        ArrayList<Pet> petArrayList= new ArrayList<Pet>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many pets you have?");
        int noOfPets= scanner.nextInt();
        //System.out.println("what kind of pets you have? enter each of their type and name");
        for(int i=1;i<=noOfPets;i++) {
            System.out.println("Enter pet type");
            petType = scanner.next();
            System.out.println("Enter pet name");
            petName = scanner.next();
            switch (petType.toLowerCase()){
                case "dog":
                    petArrayList.add(new Dog(petType,petName));
                    break;
                case "cat":
                    petArrayList.add(new Cat(petType,petName));
                    break;
                case "bird":
                    petArrayList.add(new Bird(petType,petName));
                    break;
                default:
                    System.out.println("I don't like this pet . Please enter a Cat,Dog or Bird");
                    break;
            }
        }

        for (Pet petObj:petArrayList) {
            System.out.print(petObj.getName()+" "+petObj.speak());


        }
    }
}
