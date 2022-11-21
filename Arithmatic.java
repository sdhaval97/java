import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();

        System.out.println("Enter the second number: ");
        int b = input.nextInt();

        int sum = a + b;
        System.out.println("The sum: " + sum);

        int difference = a - b;
        System.out.println("The difference: " + difference);

        int product = a * b;
        System.out.println("The product: " + product);

        int quotient;
        int remainder;
        if (a > b) {
            quotient = a / b;
            remainder = a % b; 
        }

        else {
            quotient = b / a;
            remainder = b % a;
        }

        System.out.println("The quotient: " + quotient);
        System.out.println("The modulo is: " + remainder);
        
    }
}
