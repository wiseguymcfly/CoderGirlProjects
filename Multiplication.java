import static java.lang.System.out;
import java.util.Scanner;

public class Multiplication {
    public static void main (String args[]){
        Scanner keyboard = new Scanner(System.in);
        out.println("What number do you want to go up to?");

        //user types this, goes into int
        int size = keyboard.nextInt();

        int firstNumber = 0;
        while (firstNumber != size ){
        for (int counter = 0; counter <= size; counter++){
            if (counter == size){
                firstNumber++;

                //second counter
                int count = 0;
                int secondNumber = 0;
                while (secondNumber != size){
                    for (count = 0; count <= size; count++){
                        if (count == size){
                            secondNumber++;
                        }
                        int result = 0;
                        result = firstNumber * secondNumber;
                        out.println(""+firstNumber+" * "+secondNumber+" = "+result+"");
                    }

                }
            }

            }
        }
    }
}
