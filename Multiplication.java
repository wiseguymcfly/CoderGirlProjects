import static java.lang.System.out;
import java.util.Scanner;

public class Multiplication {
    public static void main (String args[]){
        Scanner keyboard = new Scanner(System.in);
        out.println("What number do you want to go up to?");

        //user types this, goes into int
        int size = keyboard.nextInt();

        //first four loop
        for (int i = 0; i <= size; i++){
            //second four loop
            for (int j = 0; j <= size; j++){
                int result = 0;
                result = i * j;
                out.println(""+i+" * "+j+" = "+result+"");
                }
            }
        }
    }
