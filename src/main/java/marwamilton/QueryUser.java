package marwamilton;

import java.util.Scanner;

/**
 * Created by mkulima on 1/31/17.
 */
public class QueryUser {

    public int scanInt(String messageToDisplay){
        System.out.println(messageToDisplay);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public String scanString(String messageToDisplay){
        System.out.println(messageToDisplay);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

}
