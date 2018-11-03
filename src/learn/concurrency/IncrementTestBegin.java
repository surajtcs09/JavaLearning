package learn.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IncrementTestBegin {

	private static int countOfThread;
	
		public void simpleTest(){
			ExecutorService threadPool = Executors.newFixedThreadPool(5);
			threadPool.submit(t1);
			threadPool.submit(t2);
			}
		
		private Runnable t1 = new Runnable(){
			@Override
			public void run() {
				System.out.println("Thread 1 executed.");
				System.out.println(countOfThread++);
			}			
		};
		
		private Runnable t2 = new Runnable(){
			@Override
			public void run(){
				System.out.println("Thread 2 executed.");
				System.out.println(countOfThread++);
			}
		};
		public static void main(String[] args){
			new IncrementTestBegin().simpleTest();	
		}
}