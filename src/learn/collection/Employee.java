package learn.collection;

public class Employee implements Comparable<Object>{
	private String firstName;
	private String lastName;
	private int age;
	private String department;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
	    /*
	     * To sort the object based on age in ascending order 
	     */
		/*if(this.age>emp.age){
	    	return 1;
	    }else if(this.age==emp.age){
	    	return 0;
	    }else{
	    	return -1;
	    }*/
		return this.age-emp.age;
		/*
		 * To sort the object based on first name in ascending order
		 */
		/*int compare= this.firstName.compareTo(emp.firstName);
		if(compare>0)
			return 1;
		else if(compare<0)
			return -1;
		else
			return 0;*/
	}
	
}
