package AliceAndBobGreeting;

import java.util.Scanner;

/**
 * Created by joshuakelley on 9/9/16.
 */
public class AliceAndBobGreeting {
    public String getName(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type name here: ");

        return scanner.next();
    }
    public String greet(String clientName){


        String ans = (clientName.equals("Bob") || clientName.equals("Alice"))? " " + clientName : "" ;

        return "Hello" + ans;
    }
    public static void main(String[] args) {
        AliceAndBobGreeting test = new AliceAndBobGreeting();

        System.out.println(test.greet(test.getName()));

    }
}
