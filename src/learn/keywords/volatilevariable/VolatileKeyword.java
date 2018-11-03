package learn.keywords.volatilevariable;

public class VolatileKeyword {
	private volatile static boolean stopped;
	public static void main(String args[]){
		Thread thread = new Thread(run);
		thread.start();
		Thread thread1 = new Thread(run1);
		thread1.start();
	}
	
	static Runnable run = new Runnable(){
		@Override
		public void run() {
			while(!stopped){
				System.out.println("Some work is done.");
			}
		}		
	};
	
	static Runnable run1= new Runnable(){
		@Override
		public void run() {
			pleaseStop();
		}		
	};
	public static void pleaseStop(){
		stopped = true;
	}
}
