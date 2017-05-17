/**
 * Created by andrewwong on 5/4/17.
 */
public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        ListOfPets listOfPets = new ListOfPets();
        Pet currentPet;
        String nameOfCurrentPet;
        int numberOfPets = display.askUserHowManyPets();
        for(int i = 1; i <= numberOfPets; i++){
            display.printPetLoopMessage(i);
            currentPet = display.askUserKindOfPet();
            nameOfCurrentPet = display.askUserNameOfPet();
            currentPet.setName(nameOfCurrentPet);
            listOfPets.addPetToList(currentPet);
        }
        for(Pet pet: listOfPets.getListOfPets()){
            display.printName(pet);
            System.out.print(" says ");
            pet.speak();
        }
    }
}
