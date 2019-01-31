
package threadpart2.pkg1;

public class Thread3 implements Runnable{
    int minNumber;
    int maxNumber;
    int primeCheck;
    int totalCount;

    public Thread3(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }
    
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        // prime number count between 2 to 500000
        for(int i=minNumber;i<=maxNumber;i++){
            primeCheck = 0;
            for(int j=i;j>=2;j--){
                if(i%j==0){
                    primeCheck++;
                }
            }
            if(primeCheck==1){
                totalCount++;
            }
        }
        long endTime = System.currentTimeMillis();
        long differenceBetweenTime = endTime - startTime;
        System.out.println("From thread3, Total Number of prime number is "+totalCount+" and time to execution "+ (differenceBetweenTime/1000));
    }
    
}
