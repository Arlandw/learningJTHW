/**
 * Created by arlandwhitfield on 6/2/17.
 * Exercise 5: Saving Information in Variables
 */
public class CreatingVariables {
    public static void main( String[] args ) {
        int x, y, age, z;
        double seconds, e, checking, pi;
        String firstName, lastName, title, nickName, girlFriend;

        x = 10;
        y = 400;
        age = 39;
        z = 121;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        pi = 3.14;

        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr.";
        nickName = "Bear";
        girlFriend = "Kyanni";

        System.out.println( "The variable x contains " + x);
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "The experiment took " + seconds + " seconds." );
        System.out.println( "A favorite irrational # is Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!");
        System.out.println( "My name's " + title + " " + firstName + lastName );
        System.out.println( " The value for z is " + z + ". The value for pi is " + pi + ". My nickname is " + nickName + " . My girlfriend's name is " + girlFriend + "." + age );

    }
}


