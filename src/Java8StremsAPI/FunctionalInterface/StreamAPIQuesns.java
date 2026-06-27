package Java8StremsAPI.FunctionalInterface;


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import javax.print.attribute.standard.Chromaticity;
import javax.swing.plaf.ComponentInputMapUIResource;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;
    private int yearOfJoining;
    private int totalExp;
    private String designation;

    public Employee(int id, String name, int age, long salary, String gender, String deptName,
                    String city, int yearOfJoining, int totalExp, String designation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
        this.yearOfJoining = yearOfJoining;
        this.totalExp = totalExp;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", deptName='" + deptName + '\'' +
                ", city='" + city + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", totalExp=" + totalExp +
                ", designation='" + designation + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public int getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(int totalExp) {
        this.totalExp = totalExp;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}


public class StreamAPIQuesns {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(29, "def", 32, 646, "M", "IT", "Bengaluru", 2011, 14, "Manager"));
        empList.add(new Employee(11, "kyl", 33, 433, "M", "HR", "Hyderabad", 2022, 3, "Manager"));
        empList.add(new Employee(12, "gfh", 34, 120, "F", "Sales", "Bengaluru", 2017, 8, "Sales"));
        empList.add(new Employee(13, "whj", 35, 323, "M", "Sales", "Chennai", 2013, 12, "HR"));
        empList.add(new Employee(14, "wej", 36, 233, "M", "HR", "Coimbatore", 2014, 11, "HR"));

        empList.add(new Employee(5, "web", 21, 323, "M", "IT", "Pune", 2011, 14, "SDE-3"));
        empList.add(new Employee(3, "fbw", 20, 332, "M", "IT", "Trivandam", 2022, 3, "SDE-2"));
        empList.add(new Employee(2, "weh", 22, 322, "F", "IT", "Pune", 2016, 9, "SDE-3"));
        empList.add(new Employee(19, "ehw", 28, 222, "F", "IT", "Trivandam", 2011, 14, "DevOps Engineer"));

        empList.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);

        //group employees by city
        Map<String, List<Employee>> hmap = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        //find names of all the departments in the organization

        List<String> list = empList.stream().map(Employee::getName).distinct().toList();

        System.out.println(list);


    }
}


