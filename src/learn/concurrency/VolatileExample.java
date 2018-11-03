package learn.concurrency;
public class VolatileExample {
	  int x = 0;
	  volatile boolean v = false;
	  public void writer() {
	    x = 42;
	    v = true;
	  }

	  public void reader() {
	    if (v == true) {
	      System.out.println("x="+x);
	      System.out.println("v="+v);
	    }
	  }
	  
	  Runnable task1 = new Runnable(){

		@Override
		public void run() {
			while(v){
				writer();
			}
		}
		  
	  };
	  Runnable task12 = new Runnable(){

		@Override
		public void run() {
			while(v){
				reader();
			}
		}
		  
	  };
	  
	  public static void main(String[] args){
		  
	  }
	}
