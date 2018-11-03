package learn.singleton;

class Singleton3 extends Singleton3Super{
	int x,y;
	private static Singleton3 s1obj;
	private Singleton3(){
		x=300;
		y=400;
	}
	public static Singleton3 getInstance(){
		if(s1obj==null)
			s1obj = new Singleton3();
		return s1obj;
	}
}
class Singleton3Super implements Cloneable{
	Singleton3Super s3s;
	public Object clone(){
		try {
			s3s= (Singleton3Super) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s3s;
		
	}
}
public class SingletonClone {
	public static void main(String[] args){
		 Singleton3 s3obj1= Singleton3.getInstance();
		 System.out.println("Instance of Singleton: s3obj1");
		 System.out.println("x="+s3obj1.x);
		 System.out.println("y="+s3obj1.y);
		 
		 Singleton3 s3obj2= (Singleton3) Singleton3.getInstance().clone();
		 System.out.println("Instance of Singleton created using clone: s3obj2");
		 System.out.println("x="+s3obj2.x);
		 System.out.println("y="+s3obj2.y);
		 
		 s3obj1.x=30;
		 System.out.println("Changes done in s3obj1 object");
		 System.out.println("After change:");
		 System.out.println("Instance of Singleton: s3obj1");
		 System.out.println("x="+s3obj1.x);
		 System.out.println("y="+s3obj1.y);
		 System.out.println("Instance of Singleton created using clone: s3obj2");
		 System.out.println("x="+s3obj2.x);
		 System.out.println("y="+s3obj2.y);
		 
		 System.out.println("Here, even after changing the s3obj1, s3obje is not changed becuase"
		 		+ "\nthey are referring to different object. So,"
		 		+ "\nAbove code shows that we can create a new object of "
		 		+ "\nSingleton class using cloning if any superclass of Singleton class "
		 		+ "\nhas overridden the clone()");
		 
	}
}
