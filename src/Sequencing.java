/**
 * Created by Arland on 6/6/2017.
 */

import java.util.Scanner;

public class Sequencing {
    public static void main( String[] args ) {
        // This code is broke until I fix it

        Scanner keyboard = new Scanner(System.in);
        double price = 0, salesTax, total;

        salesTax = price * 0.0825;
        total = price + salesTax;

        System.out.print( "How much is the purchase price?");
        price = keyboard.nextDouble();

        System.out.println( "Item Price:\t" + price);
        System.out.println( "Sales tax:\t " + salesTax);
        System.out.println( "Total cost:\t" + total );
    }
}
