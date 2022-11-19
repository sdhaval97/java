// Taking in integer inputs from user and printing their quotient

//importing Scanner class to take in user input
import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();

        System.out.println("Enter the second number: ");
        int b = input.nextInt();

        int quotient;

        if (a > b) {
            
            quotient = a/b;
            System.out.println("The quotient is: " + quotient);
            
        }

        else {
            quotient = b/a;
            System.out.println("The quotient is: " + quotient);
        }
        
    }
}