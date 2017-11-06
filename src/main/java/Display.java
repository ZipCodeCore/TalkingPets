import java.util.Scanner;

/**
 * Created by danries on 1/31/17.
 */
public class Display {

    Scanner sc = new Scanner(System.in);

    public int askUserForInt(String question){
        System.out.println(question);
        int amount = sc.nextInt();
        sc.nextLine();
        return amount;
    }

    public String askUserForString(String question){
        System.out.println(question);
        String string = sc.nextLine();
        return string;
    }

}
