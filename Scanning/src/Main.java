import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Input saves in constructor
        Scanner student = new Scanner(System.in);
        System.out.println("Write your name: ");
        //access to the scanner variable "name"
        String name = student.next();

        System.out.println("Write your ID: ");
        String userID = student.next();

        System.out.println("Write your Batch: ");
        int batch = student.nextInt();

        System.out.println("Write your CGPA: ");
        double cgpa = student.nextDouble();

        System.out.println("Name: "+name.toUpperCase());
        System.out.println("ID: "+userID);
        System.out.println("Batch: "+batch);
        System.out.println("CGPA: "+cgpa);
    }
}
