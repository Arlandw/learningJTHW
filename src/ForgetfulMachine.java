/*
 * Created by arlandwhitfield on 6/2/17.
 * Exercise 7: Getting Input from a Human
 */

import java.util.Scanner;

public class ForgetfulMachine {
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "What city is the capital of France?" );
        keyboard.next();

        System.out.println( "Whatis 6 multiplied by 7?" );
        keyboard.nextInt();
        // Command fails when user inputs anything that isn't a integer

        System.out.println( "Enter a number between 0.0 and 1.0." );
        keyboard.nextDouble();
        // Command fails when user inputs a string

        System.out.println( "Is there anything else you would like to say?" );
        keyboard.next();
    }
}
