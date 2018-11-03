package learn.cloning;

public class SimpleReference implements Cloneable {
	int x;
	int y;
	SimpleReference(){
		x=20;
		y=10;
		System.out.println("Inside Constructor: x= " +x);
		System.out.println("Inside Constructor: y= " +y);
	}
	public static void main(String[] args){
		SimpleReference sr= new SimpleReference();
				/*
		 * Compile time error
		sr.SimpleReference();*/
		SimpleReference sr1 = null;
		try {
			sr1 = (SimpleReference) sr.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sr.x=30;
		System.out.println("x= " +sr.x);
		System.out.println("y= " +sr.y);
		System.out.println("Value of Referenced Object x= " +sr1.x);
		System.out.println("Value of Referenced Object y= " +sr1.y);
		
	}
}
