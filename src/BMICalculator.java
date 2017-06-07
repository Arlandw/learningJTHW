/**
 * Created by Arland on 6/6/2017.
 */

import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args) {
        Scanner keyboard= new Scanner(System.in);
        double m, kg, bmi, bmi2;
        int inches, pounds;

        System.out.print( "Your height in m: ");
        m = keyboard.nextDouble();

        System.out.print( "Your weight in kg: ");
        kg = keyboard.nextDouble();

        bmi = kg / (m*m);

        System.out.println( "Your BMI is " + bmi );

        System.out.print( "Your height in inches: ");
        inches = keyboard.nextInt();

        System.out.print( "Your weight in pounds: ");
        pounds = keyboard.nextInt();

        m = (inches * 0.0254);
        kg = pounds * .45359237;
        //System.out.println( pounds + " " + inches);
        bmi2 = kg / (m*m);

        System.out.print( "Your BMI is " + bmi2);
    }

}