
public class InterfaceWithNew {
	public static void main(String[] args){
		
		Runnable runnable = new Runnable(){
			@Override
			public void run() {
				System.out.println("Anonymous object is created using new keyword with "
						+ "interface name."
						+ "Here, acutally object of interface is not created. "
						+ "Internally, an anonymous class is created and instatiated. ");
				
				System.out.println("One can verify whether new anonymous class has been generated or not by "
						+ " checking the bin folder of the classpath. "
						+ "/n Bin folder will contain the file InterfaceWithNew$1.class alongwith InterfaceWithNew");
				
			}			
			
		};
		Thread th= new Thread(runnable);
		th.start();
	}
}
