package stream_api_problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{

    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}


public class FindNthHighestSalary {

    public static void main(String[] args){

        List<Integer> items = Arrays.asList(25000,45000,78000,15000,35000);
        System.out.println(items.stream().sorted((x,y) -> y-x).skip(4).findFirst().get());

        List<Employee> empList = Arrays.asList(
                new Employee(101, "Pruthviraj",29254),
                new Employee(102, "Sahil", 25000.66),
                new Employee(103,"Yogesh", 20000.99),
                new Employee(104, "Rajeshwar", 26000),
                new Employee(105, "Sudarshan", 12000.88),
                new Employee(106,"Ranjeet", 18000.76)
        );

        Employee emp = empList.stream()
                //.sorted((e1, e2) -> (int) e2.getSalary() - (int) e1.getSalary())
                .sorted(Comparator.comparingDouble(Employee :: getSalary).reversed())
                .skip(3)
                .findFirst()
                .get();

        System.out.println(emp);

        // Find Only highest salay not other employee details

        List<Employee> empList1 = Arrays.asList(
                new Employee(101, "Pruthviraj",29254.88),
                new Employee(102, "Sahil", 25000.66),
                new Employee(103,"Yogesh", 20000.99),
                new Employee(104, "Rajeshwar", 26000),
                new Employee(105, "Sudarshan", 12000.88),
                new Employee(106,"Ranjeet", 18000.76)
        );

        Double highestSalary = empList1.stream()
                .map(x -> x.getSalary())
//              .sorted(Comparator.reverseOrder())
                .sorted((x,y) -> (int) (y-x))
                .findFirst()
                .get();

        System.out.println(highestSalary);      //29254.0

    }

}
