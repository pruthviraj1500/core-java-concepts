package com.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{

    int age;
    String name;

    public Employee(int age, String name) {
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
}


public class Comparatorr {

    public static void main(String[] args){

        Comparator<Employee> com = new Comparator<Employee>()
        {
            @Override
            public int compare(Employee i, Employee j)
            {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };


        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(23,"Pruthvi"));
        emp.add(new Employee(24,"Akshay"));
        emp.add(new Employee(28,"Omkar"));
        emp.add(new Employee(25,"Deepak"));
        emp.add(new Employee(26,"Ajit"));
        emp.add(new Employee(25,"Akash"));

        Collections.sort(emp,com);

        for(Employee em : emp){
            System.out.println(em);
        }
    }

}
