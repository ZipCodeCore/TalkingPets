package collins.john;

import java.util.*;

/**
 * Created by johncollins on 1/31/17.
 */
public class main {
    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<Pet>();
        List<String> names = new ArrayList<String>();
        List<String> types = new ArrayList<String>();
        int numberOfPets;
        String name;
        String type;

        Scanner scan = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        numberOfPets = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i < numberOfPets+1; i++) {
            System.out.println("What's your number-"+i+" pet's name?");
            name = scan.nextLine();
            names.add(name);

            System.out.println("What kind of animal is it?");
            type = scan.nextLine();
            types.add(type);

        }

        //System.out.println(types);
        //System.out.println(names);


        for (int i = 0; i < numberOfPets; i++) {
            if (types.get(i).equals("cat")) {
                Pet cat = new Cat(names.get(i));
                pets.add(cat);

            }
            else if (types.get(i).equals("dog")) {
                Pet dog = new Dog(names.get(i));
                pets.add(dog);

            }
            else if (types.get(i).equals("snake")) {
                Pet snake = new Snake(names.get(i));
                pets.add(snake);
            }
            else {
               Pet pet = new Cat(names.get(i));
               pet.name = names.get(i);
               pets.add(pet);
            }
        }

        //System.out.println(types);
        //System.out.println(names);
        Collections.sort(pets);
        PetComparator diggityDuDuDOOOthis = new PetComparator();
        diggityDuDuDOOOthis.sortByType(pets);
        System.out.println("So you have " + numberOfPets + " pets, \n");
        System.out.println(pets);
        for (Pet i : pets
             ) {
            System.out.println((i.name)+" says "+ (i.speak()));
        }

    }
}







