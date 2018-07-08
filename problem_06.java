import java.io.IOException;
import java.util.Scanner;
public class fGrt {
    //public double x,y,z,gt;
    public fGrt(double x, double y, double z){
        if(x>y&&x>z){
            System.out.println("Greatest: "+x);
        }
        else if(y>z&&y>x){
            System.out.println("Greatest: "+y);
        }
        else if(z>x&&z>y){
            System.out.println("Greatest: "+z);
        }
        else
            System.out.println("Error");
        }
    }

public class greatest {
    public static void main(String[] args)throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 values: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        fGrt findGreatest = new fGrt(a,b,c);
    }
}
