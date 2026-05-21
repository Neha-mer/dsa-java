package Java8StremsAPI;

import JavaCoding.ComparatorExample;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {

    int id;
    int age;

    public Employee(int id, int age) {
        this.id = id;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class CreateStreamOfInteger {

    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Stream<Integer> stream = list.stream();
        //. How do you convert a stream back to a list?
        List<Integer> list1 = list.stream().toList();
        list1.forEach(System.out::println);
        //How do you find the count of elements in a stream?
        long c = list.stream().collect(Collectors.counting());
        System.out.println("COUNT IS" + c);
        // How do you filter even numbers from a list using streams?

        List<Integer> evenList = list.stream().filter(s -> s % 2 == 0).toList();

        System.out.println(Arrays.toString(evenList.toArray()));

        //. How do you transform a list of strings to uppercase using streams?

        List<String> strings = Arrays.asList("Hello", "I", "Am", "neha", "powerful");
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
        // How do you sort a list of numbers using streams?
        List<Integer> list3 = Arrays.asList(3, 2, 6, 4, 5, 7, 6, 6, 9, 9);

        List<Integer> sortedList = list3.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).toList();
        list3.stream().sorted().toList();
        System.out.println("index value" + sortedList.get(0));


        List<Employee> employeeList = Arrays.asList(new Employee(1, 25), new Employee(2, 15), new Employee(3, 10), new Employee(4, 20));

        List<Employee> ls = employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
        Employee employee = ls.get(2);
        System.out.println(ls.get(2));

        System.out.println(employee.getAge());
        System.out.println(employee.getId());

        // How do you limit a stream to the first 5 elements?

        list3.stream().limit(5).forEach(System.out::println);


        //How do you skip the first 3 elements in a stream?

        List<Integer> l3 = list3.stream().skip(3).toList();
        for (Integer val : l3) {
            System.out.println("values are after skipping " + val);
        }
        //#How do you find the first element of a stream?
        //10.How do you check if all elements in a stream match a given condition?
        //How do you remove duplicate elements from a list using streams?
        Set<Integer> s = new HashSet<>();
        List<Integer> duplVal = list3.stream().filter(x -> !s.add(x)).toList();
        duplVal.forEach(x -> System.out.println("values are duplicate" + x));

        //.How do you collect elements from a stream into a Set?
        list3.stream().collect(Collectors.toCollection(HashSet::new)).forEach(x -> System.out.println("values stored in HashSet" + x));

        //.How do you generate an infinite stream of random numbers?

        Random random = new Random();
        random.ints(1, 100).limit(5).boxed().forEach(System.out::println);
        //How do you create a stream from an array?
        Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        //How do you find the longest word in a list using streams
        String longestString = "Baeldung is another word of size eight in this sentence";

        Optional<String> optionalString = Optional.ofNullable(longestString)
                .filter(string -> !string.trim().isEmpty())
                .map(string -> string.split("\\s"))
                .map(Arrays::asList)
                .map(listX -> Collections.max(listX, Comparator.comparingInt(String::length)));
        optionalString.ifPresent(System.out::println);
    }
}

