package learn.keywords;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
public class Car implements Serializable {
 
   private static final long serialVersionUID = 1L;
 
    private String name;
    private String color;
 
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
 
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    
    
    public static void main(String args[]) throws Exception {
        Car car = new Car("BMW", "red");
     
        // serialize object and save it to file
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("carStorage"));
        outputStream.writeObject(car);
        outputStream.close();
     
        // reading read file and deserialize bytes to object
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("carStorage"));
        Car deserializedCar = (Car) inputStream.readObject();
        System.out.println(serialVersionUID);
        System.out.println(deserializedCar);
    }
}
