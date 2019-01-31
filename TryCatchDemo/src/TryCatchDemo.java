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
            System.out.println("Sum is: " + (a + b));
            System.out.println("Subtraction is: " + (a - b));
            System.out.println("Multiplication is: " + (a * b));
            System.out.println("Division is: " + (a / b));
        } catch (Exception ex) {
            System.out.print("Error:  " + ex.getMessage());
        }
    }
}
