package trycatchdemo;

import java.util.Scanner;

public class TryCatchDemo {

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();

        System.out.print("\nEnter second number: ");
        int b = scan.nextInt();

        calcultion(a, b);
    }

    private static void calcultion(int a, int b) {
        try {
            System.out.println("Sum if a and b is: " + (a + b));
            System.out.println("Sub if a and b is: " + (a - b));
            System.out.println("Multiply if a and b is: " + (a * b));
            System.out.println("Div if a and b is: " + (a / b));
        } catch (Exception ex) {
            System.out.print("Error:  " + ex.getMessage());
        }

    }

}
