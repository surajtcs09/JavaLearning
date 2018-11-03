package learn.singleton;

class Singleton5{
	int x,y;
	private static Singleton5 s1obj;
	private Singleton5(){
		x=300;
		y=400;
	}
	public static Singleton5 getInstance(){
		if(s1obj==null)
			s1obj = new Singleton5();
		return s1obj;
	}
	public Object clone(){
	
			return Singleton5.getInstance();
	}
}
public class SingletonCloneSolution {
	public static void main(String[] args){
		Singleton5 s1obj = Singleton5.getInstance();
		System.out.println("Singleton Instance: s1obj");
		System.out.println("x="+s1obj.x);
		System.out.println("y="+s1obj.y);
		
		s1obj.x=30;
		Singleton5 s2obj = Singleton5.getInstance();
		System.out.println("Another instance of Singleton: s2obj");
		System.out.println("x="+s2obj.x);
		System.out.println("y="+s2obj.y);
		Singleton5 s3obj = (Singleton5) s2obj.clone();
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
				+ "\ndoes reflect to the other object as clone() is itself using static"
				+ "\nfactory method for the object creation. This means cloning violates the concept of "
				+ "\nSingleton (i.e. creating only one instance of the object. To avoid this we need to point the"
				+ "\nclone() to static factory method for object creation. ");
		
	}
}
