package io.zipcoder.polymorphism;

public class MainApplication {
    public static void main(String[] args){
        Pet myPet = new Pet();
        Pet myCat = new Cat();
        Pet myDog = new Dog();
        Pet myLion = new Lion();
        myPet.speak();
        myCat.speak();
        myDog.speak();
        myLion.speak();
// would these methods be better in main method or pet method?

    }
}
