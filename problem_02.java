import java.util.Scanner;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws IOException{
        double radius;
        Scanner input = new Scanner(System.in);

        System.out.println("Input radius: ");
        radius = input.nextDouble();

        double area = Math.PI * Math.pow(radius,2);
        double circumference = Math.PI * radius * 2;

        System.out.printf("Area : "+"%.4f" + "\n",area);
        System.out.printf("Circumference : "+"%.4f" + "\n",circumference);
    }
}
