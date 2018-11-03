package learn.enumurations;




public enum EmployeeDataType {AGE("Age")
	, DEPARTMENT("Department")
	, FIRSTNAME("FirstName") 
	, LASTNAME("LastName");

	private String type;

	EmployeeDataType(String type) {
    this.type = type;
}
	

public String type() {
    return type;
}

/*
 * getTypeUsingValue() is used to get the Enum constant providing its value
 * values() provides all the constants of enum
 * values() is implicit.
 */
public static EmployeeDataType getTypeUsingValue(String value){
	/* 
	 * All the constants of an enum type can be obtained by calling the 
	 * implicit public static T[] values() method of that type.
	 * Source: https://docs.oracle.com/javase/8/docs/api/java/lang/Enum.html
	 */
	for(EmployeeDataType dataType: values()){
		/*if(dataType.type.equals(value)){
			return dataType;
		}*/
		// better way of comparison
		if(value.equals(dataType.type)){
			return dataType;
		}
		
	}
	return null;
	
}
};
