/**
 * Created by Arland on 6/6/2017.
 */
import java.util.Scanner;

public class RudeQuestions {
    public static void main( String[] args ) {
        String name, loveOfLife;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. What is your name?");
        name = keyboard.next();

        System.out.print("Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + ", eh? That's not very old.");
        System.out.print( "How much do you weigh, " + name + "?");
        weight = keyboard.nextDouble();

        System.out.println ( weight + "! Better keep that quite!!");
        System.out.print("Finally, what's your income, " + name + "? ");
        income = keyboard.nextDouble();

        System.out.print( "Hopefully that is " + income + " per hour" );
        System.out.println( " and not per year!");
        System.out.print( "Well, thanks for answering my rude questions, " );
        System.out.println( name + ".");

        System.out.print( "Who is the love of your life?");
        loveOfLife = keyboard.next();

        System.out.print( "The love of " + name + "'s life is " + loveOfLife + ".");

        // 1. The code does not blow up when an integer is used when a double is declared because an integer technically is a double 1 = 1.0 2 = 2.0 etc
        // 2. The code does not blow up when I use an integer in a string field because a integer can be a string
        // 3. F3 breaks every input with the exception of the string field. This is because F3 is a string and is not a valid integer or double
        //


    }

}
