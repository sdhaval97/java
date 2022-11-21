// Creating a code to print out the multiplication table for user entered integer

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();

        for(int i = 1; i <= 10; i ++) {

            int mul = a * i;
            System.out.println(a + " x " + i + " = " + mul);
        }
        
    }
}
