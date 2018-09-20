
import static java.lang.System.out;
import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String args[]){
        int x = add(5,7);

        //add
        System.out.println("5 plus 7 equals " + x);
        System.out.println("3 plus 5 equals " + add(3, 5));
        System.out.println("1 plus 2 equals " + add(1, 2));

        //subtract
        System.out.println("9 minus 4 equals " + subtract(9, 4));
        System.out.println("9 minus 3 equals " + subtract(9, 3));

        //multiply
        System.out.println("3 times 3 equals " + multiply(3, 3));
        System.out.println("2 times 4 equals " + multiply(2, 4));

        //divide
        System.out.println("10 divided by 5 equals " + divide(10, 5));
        System.out.println("16 divided by 4 equals " + divide(16, 4));

        /* This needs to be its own method, int type instead of void
        System.out.println("\n");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter calculation\n");
        int num1 = 0;
        int num2 = 0;

        //operator
        String operation;
        operation = keyboard.nextLine();
        if(operation.equals ("*")){
            return add(num1, num2);*/

        }
    }

