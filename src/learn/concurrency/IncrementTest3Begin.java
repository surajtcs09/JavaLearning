package learn.concurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IncrementTest3Begin {

    private static int total = 0;
    private static int countT1 = 0;
    private static int countT2 = 0;
    private boolean run = true;

    public IncrementTest3Begin() {
    	long startTime = System.nanoTime();
    	
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        newCachedThreadPool.execute(t1);
        newCachedThreadPool.execute(t2);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) {
            Logger.getLogger(IncrementTest3Begin.class.getName()).log(Level.SEVERE, null, ex);
        }
        run = false;
        System.out.println("**************************************8");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) {
            Logger.getLogger(IncrementTest3Begin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println((countT1 + countT2 + " == " + total));
        long endTime   = System.nanoTime();
    	long totalTime = endTime - startTime;
    	System.out.println("Total time taken by the program to execute: "+totalTime/1000000);
    }

    private Runnable t1 = new Runnable() {
        @Override
        public void run() {
            while (run) {
                total++;
                countT1++;
                System.out.println("Hello #" + countT1 + " from Thread 2! Total hello: " + total);
            }
        }
    };

    private Runnable t2 = new Runnable() {
        @Override
        public void run() {
            while (run) {
                total++;
                countT2++;
                System.out.println("Hello #" + countT2 + " from Thread 2! Total hello: " + total);
            }
        }
    };

    public static void main(String[] args) {
        new IncrementTest3Begin();
    }
}
