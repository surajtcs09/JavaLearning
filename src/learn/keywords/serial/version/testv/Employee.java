package learn.keywords.serial.version.testv;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	private transient String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	Employee(String name, int age){
		this.name= name;
		this.age=age;
	}
	
	@Override
	public String toString(){
		return "Employee: Name-"+this.name+" Age-"+this.age;
	}
	
}