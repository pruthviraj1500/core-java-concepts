package stream_api_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountMaleAndFemaleEmp {

    private int id;
    private String name;
    private double salary;
    private String gender;

    public CountMaleAndFemaleEmp(int id, String name, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "CountMaleAndFemaleEmp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }



    public static void main(String[] args){

        List<CountMaleAndFemaleEmp> empList = Arrays.asList(
                new CountMaleAndFemaleEmp(101,"Pruthviraj",29254.88,"M"),
                new CountMaleAndFemaleEmp(102,"Yogesh",24654.88,"M"),
                new CountMaleAndFemaleEmp(103,"Srushti",150000.18,"F"),
                new CountMaleAndFemaleEmp(104,"Shubham",250000.00,"M"),
                new CountMaleAndFemaleEmp(105,"Anuja",8000.38,"F")
        );

        Object obj = empList.stream()
                .collect(Collectors.groupingBy(CountMaleAndFemaleEmp::getGender, Collectors.counting()));

        System.out.println(obj);  // output : {F=2, M=3}

    }

}
