package learn.singleton;

class Singleton4 implements Cloneable{
	int x,y;
	private static Singleton4 s1obj;
	private Singleton4(){
		x=300;
		y=400;
	}
	public static Singleton4 getInstance(){
		if(s1obj==null)
			s1obj = new Singleton4();
		return s1obj;
	}
	public Object clone(){
		Singleton4 sobjNew = null ;
		try {
			sobjNew = (Singleton4) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sobjNew;
	}
}
public class SingletonCloneImplementation {
	public static void main(String[] args){
		Singleton4 s1obj = Singleton4.getInstance();
		System.out.println("Singleton Instance: s1obj");
		System.out.println("x="+s1obj.x);
		System.out.println("y="+s1obj.y);
		
		s1obj.x=30;
		Singleton4 s2obj = Singleton4.getInstance();
		System.out.println("Another instance of Singleton: s2obj");
		System.out.println("x="+s2obj.x);
		System.out.println("y="+s2obj.y);
		Singleton4 s3obj = (Singleton4) s2obj.clone();
		s3obj.x=3000;
		System.out.println("Another instance of Singleton: s3obj");
		System.out.println("x="+s3obj.x);
		System.out.println("y="+s3obj.y);
		System.out.println("Instance of Singleton: s2obj called after change in s3obj");
		System.out.println("x="+s2obj.x);
		System.out.println("y="+s2obj.y);
		System.out.println("Instance of Singleton: s1obj called after change in s3obj");
		System.out.println("x="+s1obj.x);
		System.out.println("y="+s1obj.y);
		System.out.println("Here, s3obj is created using clone(). If any change done in s3obj, then it"
				+ "\ndoes not reflect to the other object. This means cloning violates the concept of "
				+ "\nSingleton (i.e. creating only one instance of the object. To avoid this we need to point the"
				+ "\nclone() to static factory method for object creation. ");
		
	}
}
