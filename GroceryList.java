//Lauren Zera. This is my code for the first assignment-Grocery List.//

import static java.lang.System.out;
import java.util.Scanner;


public class GroceryList {
    public static void main (String[] args){
        Scanner keyboard = new Scanner (System.in);
        //variable//
        String grocery1;
        //prompt 1//
        out.print ("Please list 3 items on your grocery shopping list. Item 1?\n");
        String word = keyboard.next();
        keyboard.skip ("\n");

        String grocery2;
        //won't prompt next item!//
        out.print("Second item?");
        String grocery = keyboard.next();
        keyboard.skip ("\n");

        String grocery3;
        out.print("Third item?");
        String food = keyboard.next();

        out.print ("Now please enter the quantity of each item. How many of Item 1? ");
        int first = keyboard.nextInt();
        keyboard.skip ("\n");

        out.print ("How many of Item 2?");
        int second = keyboard.nextInt();
        keyboard.skip ("\n");

        out.print ("How many of Item 3?");
        int third = keyboard.nextInt();

        out.print ("Next enter the price of each item. Don't use $! Item 1?");
        float price1 = keyboard.nextFloat();
        keyboard.skip ("\n");

        out.print ("Item 2?");
        float price2 = keyboard.nextFloat();
        keyboard.skip ("\n");

        out.print ("Item 3?");
        float price3 = keyboard.nextFloat();
        keyboard.skip ("\n");

        int itemCount = 0;
        float itemCost = 0;
        itemCount = first + second + third;
        itemCost =  (price1 * first) + (price2 * second) + (price3 * third);

        float itemPrice = itemCount * itemCost;
        out.println ("The price is "+ itemCost+ "dollars.\n");

    }
}

