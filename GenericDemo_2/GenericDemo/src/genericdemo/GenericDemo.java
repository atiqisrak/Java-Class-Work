
package genericdemo;

import java.util.ArrayList;
import java.util.Collections;

public class GenericDemo {

    public static <E> void showElements(E value){
        System.out.println(value);
    }
    
    public static <E> void showArrayElements(E[] values){
        for(E elements : values){
            System.out.print(elements);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        showElements(1);
        showElements(1.1);
        showElements("Hello");
        
        Integer[] a = {1,2,3,4,5};
        Double[] d = {1.1, 2.2, 3.3};
        String[] s = {"A", "d", "c"};
        showArrayElements(a);
        showArrayElements(d);
        showArrayElements(s);
        
        Person p = new Person(1);
        Person p1 = new Person(1.2);
        Person p3 = new Person("Java");
        Person<Integer> intPerson = new Person<>(1);
        
        System.out.println(intPerson.getObject());
        
        
        /*
        ============= Collection =============
        */
        
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(1.1);
        list.add("hello");
        
        
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(7);
        intList.add(5);
        intList.add(9);
        intList.add(4);
        intList.add(6);
        
        System.out.println("Before sort");
        for(int elements:intList){
            System.out.print(elements);
        }
        System.out.println();
        
        Collections.sort(intList);
        
        System.out.println("After Sort");
        for(int elements:intList){
            System.out.print(elements);
        }
        
        
    }
    
}
