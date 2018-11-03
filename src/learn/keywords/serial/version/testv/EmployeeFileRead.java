package learn.keywords.serial.version.testv;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeFileRead {
	public static void main(String[] args){
		ObjectInputStream ois =null;
		String fileName="employeeFile";
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
