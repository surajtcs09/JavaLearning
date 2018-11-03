package learn.cloning;


class Test1{
	int x,y;
	String strInTest1;
	public Test1(){
		x=10;
		y=20;
		strInTest1="String value in Test1";
	}
}
class Test2 implements Cloneable{
	int a;
	int b;
	String strInTest2;
	Test2(){
		a=30;
		b=40;
		strInTest2= "String value in Test2";
	}
	public Object clone(){
		try {
			Test2 test2 = (Test2)super.clone();
			test2.test1Obj = new Test1();
			return test2;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	Test1 test1Obj = new Test1();
}
public class CloningInJava implements Cloneable{
	public static void main(String[] args){
		System.out.println("Default values- ");
		Test2 test2 = new Test2();
		System.out.println("x= "+test2.test1Obj.x);
		System.out.println("y= "+test2.test1Obj.y);
		System.out.println("String in Test1= "+test2.test1Obj.strInTest1);
		System.out.println("a= "+test2.a);
		System.out.println("b= "+test2.b);
		System.out.println("String in Test2= "+test2.strInTest2);
		// Below line gives error : "The method clone() from the type Object is not visible if Cloneable is not implemented"
		// Here, Test1 is used as data member in Test2. 
		// And, Test1 object is not created separately while cloning Test2, so this is Shallow Cloning
		// If we modify the value of Test1 object using cloned object of Test2, then value of Test1 object will also get modified
		// in original Test2  object
		Test2 test2ClonedObj = (Test2) test2.clone();
		System.out.println("Cloned object values");
		System.out.println("x= "+test2ClonedObj.test1Obj.x);
		System.out.println("y= "+test2ClonedObj.test1Obj.y);
		System.out.println("String in Test1= "+test2ClonedObj.test1Obj.strInTest1);
		System.out.println("a= "+test2ClonedObj.a);
		System.out.println("b= "+test2ClonedObj.b);
		System.out.println("String in Test2= "+test2ClonedObj.strInTest2);
		// Change the value of object used as data member using cloned object  and change the value of one prmitive type
		System.out.println("Changing the value of ojbect used as data member using cloned object");
		test2ClonedObj.test1Obj.x=100;
		test2ClonedObj.test1Obj.strInTest1 = "Modifed value of Test1 str object using cloned object of Test2";
		test2ClonedObj.a=300;
		test2ClonedObj.strInTest2="Modified value of Test2 by cloned object of Test2";
		System.out.println("Default values- after changing the data of object of object using cloned object of Test2");
		System.out.println("x= "+test2.test1Obj.x);
		System.out.println("y= "+test2.test1Obj.y);
		System.out.println("String in Test1= "+test2.test1Obj.strInTest1);
		System.out.println("a= "+test2.a);
		System.out.println("b= "+test2.b);
		System.out.println("String in Test2= "+test2.strInTest2);
		System.out.println("Cloned object values- after changing the data of object of object using cloned object");
		System.out.println("x= "+test2ClonedObj.test1Obj.x);
		System.out.println("y= "+test2ClonedObj.test1Obj.y);
		System.out.println("String in Test1= "+test2ClonedObj.test1Obj.strInTest1);
		System.out.println("a= "+test2ClonedObj.a);
		System.out.println("b= "+test2ClonedObj.b);
		System.out.println("String in Test2= "+test2ClonedObj.strInTest2);
		System.out.println("Point to be noted here that: if we changed the value of test2ClonedObj.test1Obj.x, then value of "
				+ "\ntest2.test1Obj.x  is also changed. This is because test1Obj is just the reference pointing to the object created in Test2 initial object"
				+ "\nIn its cloned object, Test1 object is not created separately."
				+ "\nThis is called Shallow cloning.");
		
		
	}
}
