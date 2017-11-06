package io.zipcoder.pets;

import java.util.Scanner;

public class ConsoleInput {

    Scanner scan = new Scanner(System.in);
    int num;
    String words;

    public void startQuestions(){
        System.out.println("Hey there! This program is here to record your annoying pets!!\n" +
                "How many annoying pets do you own?");
        num = scan.nextInt();
        System.out.println("Oh my, you have " + num + " annoying pets!!!\n" +
                "What kind of pets do you own and what are their names?");
        words = scan.nextLine();
        words = scan.nextLine();
        System.out.println(words);
        words = words.substring(0);
        System.out.println(words);
        
    }

}
