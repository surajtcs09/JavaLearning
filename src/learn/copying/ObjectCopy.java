package learn.copying;

public class ObjectCopy {
	public static void main(String[] args){
		Employee emp = new Employee();
		System.out.println(emp); //learn.copying.Employee@15db9742
		emp.setName("Hello");
		emp.setRollNumber(234);   
		System.out.println("emp  obj "+emp); //learn.copying.Employee@15db9742
		
		Employee refEmp  = emp;
		System.out.println("refEmp Obj "+refEmp); //learn.copying.Employee@15db9742
		System.out.println("emp Name: "+emp.getName());
		System.out.println("refEmp Name: "+refEmp.getName());
		refEmp.setName("Hi");
		System.out.println("After changing value of reference object.");
		System.out.println("emp Name: "+emp.getName());
		System.out.println("refEmp Name: "+refEmp.getName());
		/* as we can see refEmp object is just an reference pointing to the
		object memory location same as that of emp. So, if we make any change in the 
		refeEmp object variables then emp object variables will be affected.
		So, be careful. If the object is being shared and used by multiple users then
		always perform deep copy rather than reference copy. 
		  
		*/
	}
}

class Employee{
	private String name;
	private int rollNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
}
