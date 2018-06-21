import java.util.Scanner;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws IOException {
        double a,b;
        Scanner input = new Scanner(System.in);

        System.out.println("Input numbers you want to swap: ");
        a = input.nextDouble();
        b = input.nextDouble();

        System.out.println("Numbers before swapped: a = " + a + " b = " + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Numbers after swapped: a = " + a + " b = " + b);
    }
}
