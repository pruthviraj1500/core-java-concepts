package core_java_concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Persons implements Comparable<Persons>{

    int age;
    String name;

    public Persons(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persons obj)
    {
        if(this.age > obj.age)
            return 1;
        else
            return -1;
    }
}

public class Comparablee {

    public static void main(String[] args){

        System.out.println("In main method");

        List<Persons> emp = new ArrayList<>();
        emp.add(new Persons(23,"Pruthvi"));
        emp.add(new Persons(24,"Akshay"));
        emp.add(new Persons(28,"Omkar"));
        emp.add(new Persons(25,"Deepak"));
        emp.add(new Persons(26,"Ajit"));
        emp.add(new Persons(25,"Akash"));

        Collections.sort(emp);

        for(Persons p : emp){
            System.out.println(p);
        }

    }


}
