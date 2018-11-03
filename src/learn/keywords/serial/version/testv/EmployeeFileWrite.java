package learn.keywords.serial.version.testv;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeFileWrite {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Employee emp = new Employee("Suraj Kumar", 28);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employeeFile"));
		oos.writeObject(emp);
		oos.close();
		System.out.println("emp object written to employeeFile");
	}
}
