package core_java_concepts;

import java.io.*;

class Student implements Serializable {

    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}


public class Serialization {

    public static void main(String[] args){
        System.out.println("In main method");

        try{

            //Serialization

            Student s1 = new Student(1,"Pruthvi",40);
            FileOutputStream fos = new FileOutputStream("D:/pruthviraj/Core java/serialization_demo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();
            System.out.println("Student object s1 state saved in the file successfully");

            //Deserialization

            FileInputStream fis = new FileInputStream("D:/pruthviraj/Core java/serialization_demo.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject();
            System.out.println("Student object state retrieved from file successfully");
            System.out.println(s2.id +" "+ s2.name +" "+ s2.marks);
            ois.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

}
