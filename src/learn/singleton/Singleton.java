package learn.singleton;

/*Singleton class must implement Cloneable interface as if
clone() is overridden and Cloneable is not implemented, then it
will throw CloneNotSupportedException and it will unnecessarily 
stop the flow of execution.*/
public class Singleton implements Cloneable{
	private static Singleton instance;
	
	/*Static factory method will check instance is already created, then return 
	the same instance only. If instance is null, then only create a new 
	instance*/
	public static synchronized Singleton getInstance(){
		if(instance==null)
			instance = new Singleton();
		return instance;
	}
	
    /*clone() is overridden because in future if Singleton is made the subclass of 
    class which is overriding the clone() and raised the visibilty of clone() 
    from protected to public, then clone() can be used by Singleton class object 
    to create a new instance of the object. 
    So, it's safe to override the clone() and point it to the static factory method
    for the object creation. */
	public Object clone(){
		return Singleton.getInstance();
	}
	
}
