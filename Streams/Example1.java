package Streams;

import dto.Employee;

import java.util.*;
import java.util.stream.Stream;

import static java.lang.System.*;

//https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062
public class Example1 {
    public static void main(String[] args) {

       Employee[] empArr = {new Employee(1, "Kapil", 50000),
       new Employee(2, "Rajni", 10000),
       new Employee(3,"Kritika", 25000),
       new Employee(4, "Vipin", 12000),
       new Employee(5, "Renu", 22000),
       new Employee(6,"Boby", 30000)};
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);

     //   list.stream().filter(x -> x%2==0).forEach(x-> System.out.println(x));

        // 2. to print elements which starts with 1
       /*  list.stream()
                 .map(x -> x + "") // to convert Integer to String stream
                 .filter(x -> x.startsWith("1"))
                 .forEach(System.out::println);*/

         //3. to find duplicate elements in array using streams
      /*  Set<Integer> set = new HashSet();
        list.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);*/

        //5. find first elemenent fromt the stream
           //  list.stream().findFirst().ifPresent(System.out::println);

        //6. find the max elements from the streams
       // list.stream().max(Integer::compare).ifPresent(System.out::println);

        //7. print the elements in decending order
       // list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);



        // To compare the elements of the Dto class
//        Arrays.stream(empArr).sorted(Comparator.comparing(Employee::getSalary)
//        ).forEach(emp -> System.out.println(emp));
                //Arrays.asList({new Employee(1,"kapil",20000)},);

        // To find the Max salary of the Employee
//        Optional<Employee> maxSalary = Arrays.stream(empArr).max(Comparator.comparing(Employee::getSalary));
//              System.out.println(maxSalary);

        // return true if any match is there
//              boolean emp = Arrays.stream(empArr).anyMatch(e -> e.getName().startsWith("Kapil"));
//        System.out.println(emp);
//
//        long count = Arrays.stream(empArr).count();
//        System.out.println(count);

        //How will you get the current date and time using Java 8 Date and Time API?

       /* System.out.println("Local date "+java.time.LocalDate.now());
        System.out.println("Local Time "+java.time.LocalTime.now());
        System.out.println("Local date and Time "+java.time.LocalDateTime.now());*/

        
    }
}
