package learn.enumurations;


//Java program to demonstrate working of values(),
//ordinal() and valueOf()
enum Colors
{
 RED("red"), 
 GREEN("green"), 
 BLUE("blue");
 
 private String color;
 Colors(String color){
	 this.color=color;
 }
 
 public String color(){
	 return color;
 }
}

public class Test2
{
 public static void main(String[] args)
 {
     // Calling values()
     Colors arr[] = Colors.values();

     // enum with loop
     for (Colors col : arr)
     {
         // Calling ordinal() to find index
         // of color.
         System.out.println(col + " at index "
                          + col.ordinal());
     }

     // Using valueOf(). Returns an object of
     // Color with given constant.
     // Uncommenting second line causes exception
     // IllegalArgumentException
     // In the valueOf(), the name must match exactly an identifier 
     // used to declare an enum constant in this type.
     System.out.println(Colors.valueOf("RED"));
     // System.out.println(Colors.valueOf("red"));
     // System.out.println(Color.valueOf("WHITE"));
 }
}
