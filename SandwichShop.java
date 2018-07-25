import static java.lang.System.out;
import java.util.Scanner;


public class SandwichShop {
    public static void main (String[] args){
        //Don't change.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        //
        int Veggie = 0;
        int Burger = 0;
        int Subs = 0;
        int Soups = 0;

        out.println ( "The goal for veggie sandwiches is 50. How many veggie sandwiches were sold today?");

        Veggie = keyboard.nextInt();
        keyboard.skip ("\n");

        if (Veggie >= goalForVeggies ) {
            out.println("Goal has been met!");
        }

        else {
            out.println ("Fell short!");
        }

        out.println ("The goal for burgers is 250. How many burgers were sold today?");

        Burger = keyboard.nextInt();
        keyboard.skip ("\n");

        if (Burger >= goalForBurgers){
            out.println ("Goal has been met!");
        }
        else {
            out.println ("Fell short!");
        }

        out.println ("The goal for sub sandwiches is 180. How many subs were sold today?");
        Subs = keyboard.nextInt ();
        keyboard.skip ("\n");

        if (Subs >= goalForSubs){
            out.println ("Goal has been met!");
        }
        else{
            out.println ("Fell short!");
        }

        out.println ("The goal for soup is 70. How many soups were sold today?");

        Soups = keyboard.nextInt();
        keyboard.skip ("\n");

        if (Soups >= goalForSoup){
            out.println("Goal has been met!");
        }
        else{
            out.println("Fell short!");
        }
        if( Soups >= goalForSoup && Subs >= goalForSubs && Burger >= goalForBurgers && Veggie >= goalForVeggies){
            out.println("Goal for everything has been met!");
        }
        else{
            out.println("Goals fell short!");
        }

    }

}
