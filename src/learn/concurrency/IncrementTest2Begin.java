package learn.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IncrementTest2Begin {

	private static int totalCountOfThread=1;
	private static int countOfT1Thread=1;
	private static int countOfT2Thread=1;
	
		public void countOfThreadTest(){
			ExecutorService threadPool = Executors.newFixedThreadPool(5);
			threadPool.submit(t1);
			threadPool.submit(t2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			threadPool.submit(t1);
			threadPool.submit(t2);
		}
		
		private Runnable t1 = new Runnable(){
			@Override
			public void run() {
				System.out.println("Thread 1 executed.");
				System.out.println("Total count:"+totalCountOfThread++);
				System.out.println("Count of T1 thread:"+countOfT1Thread++);
			}			
		};
		
		private Runnable t2 = new Runnable(){
			@Override
			public void run(){
				System.out.println("Thread 2 executed.");
				System.out.println("Total count:"+ totalCountOfThread++);
				System.out.println("Count of T2 thread:"+ countOfT2Thread++);
			}
		};
		public static void main(String[] args){
			new IncrementTest2Begin().countOfThreadTest();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++==");
			System.out.println("Total count:"+ totalCountOfThread++);
		}
}