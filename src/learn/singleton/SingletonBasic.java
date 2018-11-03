package learn.singleton;

class Singleton2{
	int x,y;
	private static Singleton2 s1obj;
	private Singleton2(){
		x=300;
		y=400;
	}
	public static Singleton2 getInstance(){
		if(s1obj==null)
			s1obj = new Singleton2();
		return s1obj;
	}
}
public class SingletonBasic {
	public static void main(String[] args){
		Singleton2 s1obj = Singleton2.getInstance();
		System.out.println("Singleton Instance: s1obj");
		System.out.println("x="+s1obj.x);
		System.out.println("y="+s1obj.y);
		
		s1obj.x=30;
		Singleton2 s2obj = Singleton2.getInstance();
		System.out.println("Another instance of Singleton: s2obj");
		System.out.println("x="+s2obj.x);
		System.out.println("y="+s2obj.y);
		Singleton2 s3obj = Singleton2.getInstance();
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
		System.out.println("This proves that there is sinlge instance of Singleton2 object"
				+ "\n becuase changes done in any instance is visible in another instance too."
				+ "\n as they all are references pointing to one object only");
		
	}
}
