package learn.singleton;

public class SingletonClass {
	/*this is eager initialization. Even if the object is not
	required, then also it is created at the time of class loading 
	through static variable concept
	private static SingletonClass sobj = new SingletonClass();*/
	private static SingletonClass sobj;
	private SingletonClass(){
		
	}
	public static SingletonClass getInstance(){
		// lazy initialisation because create only if it is asked for
		if(sobj!=null){
			sobj=  new SingletonClass();
		}
		return sobj;
	}
}
