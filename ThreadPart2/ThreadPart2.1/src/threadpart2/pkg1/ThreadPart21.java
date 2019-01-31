
package threadpart2.pkg1;

public class ThreadPart21 {

    
    public static void main(String[] args) {
        Thread th1 = new Thread(new Thread1(2,100000));
        Thread th2 = new Thread(new Thread1(100001,200000));
        Thread th3 = new Thread(new Thread1(200001,300000));
        Thread th4= new Thread(new Thread1(300001,400000));
        Thread th5 = new Thread(new Thread1(400001,500000));
        
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
    
}
