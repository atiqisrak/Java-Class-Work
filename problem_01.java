import java.util.Scanner;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws IOException {
        double sum, a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Input 2 numbers: ");
        a = input.nextDouble();
        b = input.nextDouble();

        sum = a + b;

        System.out.printf("Sum : " + "%.2f" + "\n", sum);
    }
}
