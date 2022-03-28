package c4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Address add1 = new Address("Haryana","Rohtak","124001");

        Employee empl = new Employee("1","aarti",add1,"aarti@123","aarti526854");

        FileOutputStream fos = new FileOutputStream("emp.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(empl);

        oos.close();

        System.out.println(" serialized Object");

        FileInputStream fis = new FileInputStream("emp.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee obj = (Employee) ois.readObject();

        System.out.println(obj);

        ois.close();

        System.out.println("Deserialized object");


    }
}
