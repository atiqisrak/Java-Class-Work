import java.util.Scanner;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws IOException {
        double i,sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Input numbers of 5 subjects: ");

        for(i=0;i<5;i++){
            sum += input.nextDouble();
        }
        System.out.printf("Sum of subjects: " + "%.2f" + "\n", sum);

        System.out.println("Percentages of subjects = " + (sum/5) + "%");

    }
}
