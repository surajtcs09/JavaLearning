package learn.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class EmployeeDataTypeCompare implements Comparator<Employee2>{
	EmployeeDataType type;
	public EmployeeDataTypeCompare(EmployeeDataType type){
		this.type=type;
	}
	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		/*Beauty of Java Enum
		If we provide the enum as expression in switch, 
		then java automatically infers those enum constants in case. 
		We need to just call these constants without the use of Enum
		If we try to call these constants using enum, then it gives compile time
		error: "The qualified case label EmployeeDataType.AGE must be replaced with the unqualified enum constant AGE"
		*This has been restricted in java because of two reasons
		* Reason1: If there is no restriction, then we can call constant of any other enum which will never match 
		* to the provided enum in the switch(expression)
		*  Reason2: As deduced from reason1, there is no point in calling it with enum it become fixed number of 
		*  constants that can only be called
		*  
		*/
		switch(type){
		case AGE:
			return o1.getAge()-o2.getAge();
		case DEPARTMENT:
			return o1.getDepartment().compareTo(o2.getDepartment());
		case FIRSTNAME:
			return o1.getFirstName().compareTo(o2.getFirstName());
		case LASTNAME:
			return o1.getLastName().compareTo(o2.getLastName());
		default:
			return 0;
		}
	}
	
}
public class CompareData2 {
	
	public static void main(String[] args){
		Set<Employee2> employeeSet= new TreeSet<>(new EmployeeDataTypeCompare(EmployeeDataType.LASTNAME));
		Employee2 emp1= new Employee2();
		emp1.setAge(20);
		emp1.setDepartment("D1");
		emp1.setFirstName("Suraj");
		emp1.setLastName("Kumar");
		
		employeeSet.add(emp1);
		
		Employee2 emp5= new Employee2();
		emp5.setAge(25);
		emp5.setDepartment("DA");
		emp5.setFirstName("Suraj5");
		emp5.setLastName("Kumar5");
		
		employeeSet.add(emp5);
		
		Employee2 emp2= new Employee2();
		emp2.setAge(15);
		emp2.setDepartment("Dx");
		emp2.setFirstName("Suraj2");
		emp2.setLastName("Kumar2");
		employeeSet.add(emp2);
		
		int i=0;
		for(Employee2 emp: employeeSet){
			System.out.println(i++);
			System.out.println(emp.getFirstName()+" "+emp.getLastName()+
					" "+emp.getDepartment()+" "+emp.getAge());
			
		}
	}
}
