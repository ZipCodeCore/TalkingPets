import java.util.Scanner;

/**
 * Created by andrewwong on 5/4/17.
 */
public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public int requestNumber(String request){
        System.out.println(request);
        int number = scanner.nextInt();
        return number;
    }

    public String requestString(String request){
        System.out.println(request);
        String word = scanner.next();
        return word;
    }
}
