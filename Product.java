// Printing the product of 2 numbers
import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        
        //creating an object input from the scanner class
        Scanner input = new Scanner(System.in);

        //Taking in the first number from the user
        System.out.println("Enter the first number:");
        int a = input.nextInt();
        
        //Taking in the second number from the user
        System.out.println("Enter the 2nd number:");
        int b = input.nextInt();
        
        //Computing and printing the product of the 2 numbers
        int product = a * b;
        System.out.println("The product of the 2 numbers is:\n" + product);
        
    }

    
}
