package io.zipcoder.polymorphism;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Console {

    private final Scanner input;
    private final PrintStream output;

    public Console(InputStream in, PrintStream out){

        this.input = new Scanner(in);
        this.output = out;
    }

    public void print(String val, Object... args) {
        output.format(val, args);
    }

    public void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return input.nextLine();
    }

    public Integer getIntegerInput(String prompt, Object... args) {

        String stringInput = getStringInput(prompt, args);
        try {
            Integer intInput = Integer.valueOf(stringInput);
            return intInput;

        } catch (NumberFormatException nfe) { // TODO - Eliminate recursive nature
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting an integer value!");
        }

        return getIntegerInput(prompt, args);
    }
}
