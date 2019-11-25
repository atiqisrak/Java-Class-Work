import java.util.Scanner;

public class ClassAndObject {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        Student n = new Student();
        n.name = name;
        n.show();
    }
}
