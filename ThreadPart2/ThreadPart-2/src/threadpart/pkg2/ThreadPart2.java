/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpart.pkg2;

/**
 *
 * @author Teacher
 */
public class ThreadPart2 implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadPart2 th2 = new ThreadPart2();
        Thread th = new Thread(th2);
        th.start();
        System.out.println("Outside run function");
        System.out.println("Outside run function");
        System.out.println("Outside run function");
        System.out.println("Outside run function");
        System.out.println("Outside run function");
        System.out.println("Outside run function");
        System.out.println("Outside run function");
        System.out.println("Outside run function");
    }

    @Override
    public void run() {
        System.out.println("Inside run function");
        System.out.println("Inside run function");
        System.out.println("Inside run function");
        System.out.println("Inside run function");
        System.out.println("Inside run function");
        System.out.println("Inside run function");
        System.out.println("Inside run function");
        System.out.println("Inside run function");
        System.out.println("Inside run function");
    }
    
}
