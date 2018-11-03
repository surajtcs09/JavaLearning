package learn.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CompareData{
		public static void main(String[] args){
			Set<Employee> employeeSet= new TreeSet<>();
			Employee emp1= new Employee();
			emp1.setAge(20);
			emp1.setDepartment("D1");
			emp1.setFirstName("Suraj");
			emp1.setLastName("Kumar");
			
			employeeSet.add(emp1);
			
			Employee emp5= new Employee();
			emp5.setAge(25);
			emp5.setDepartment("DA");
			emp5.setFirstName("Suraj5");
			emp5.setLastName("Kumar5");
			
			employeeSet.add(emp5);
			
			Employee emp2= new Employee();
			emp2.setAge(15);
			emp2.setDepartment("Dx");
			emp2.setFirstName("Suraj2");
			emp2.setLastName("Kumar2");
			employeeSet.add(emp2);
			int i=0;
			for(Employee emp: employeeSet){
				System.out.println(i++);
				System.out.println(emp.getFirstName()+" "+emp.getLastName()+
						" "+emp.getDepartment()+" "+emp.getAge());
				
			}
		}

		
}
