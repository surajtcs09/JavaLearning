package learn.immutable;

import java.io.File;

public class ImmutableTypes {
	public static void main(String[] args){
		/*Type1 : Immutability
		Allows modification of the object through some methods,
		 modified object is stored in another 
		object. */
		String str1= "Hello";
		System.out.println(str1.concat(" I am Immutable"));
		System.out.println(str1);
		
		/*
		 * Wrapper class does not allow any method to modify object
		 */
		Integer x= 20;
	
		File file = new File("data.txt");
		System.out.println(x);
	}
}
