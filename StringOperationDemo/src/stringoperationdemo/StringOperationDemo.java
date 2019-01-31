
package stringoperationdemo;

import java.util.Arrays;


public class StringOperationDemo {

    
    public static void main(String[] args) {
        String obj = "Programming Language II Java";
        String obj1 = "Programming Language I C";
        String a = "Hello";
        String b = "World";
        String c = "";
        System.out.println(obj.charAt(10));
        System.out.println(obj.codePointAt(10));
        System.out.println(obj.codePointCount(1, 10));
        System.out.println(obj.compareTo(obj1));
        System.out.println(a.concat(b));
        System.out.println(a+b);
        System.out.println(obj.contains("I"));
        System.out.println(obj.equals(obj1));
        
        System.out.println(String.format("Factorial of %d is : %d", 1,1));
        
        System.out.println(Arrays.toString(a.getBytes()));
        
        System.out.println(c.isEmpty());
        
        System.out.println(a.length());
    }
    
}
