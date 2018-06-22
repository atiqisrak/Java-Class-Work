import java.util.*;
import java.io.*;
public class Main{
public static void main(String[] args)throws IOException{
	System.out.println("Input a number: ");
	
	int a,b,c=0;
	Scanner input = new Scanner(System.in);
	a = input.nextInt();
	
	for(int i=0; a>0; i++){
	b = a%10;
	c = c*10 + b;
	a = a/10;
	}
	System.out.println("Reversed: "+c);
}
}
