package Streams;

import com.sun.security.jgss.GSSUtil;
import dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062
public class Example1 {
    public static void main(String[] args) {

        Employee[] empArr = {new Employee(1, "Kapil", 50000),
                new Employee(2, "Rajni", 10000),
                new Employee(3, "Kritika", 25000),
                new Employee(4, "Vipin", 12000),
                new Employee(5, "Renu", 22000),
                new Employee(6, "Boby", 30000)};
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 32);

        // To make the list of arrays
        List<Employee> employeeList = Arrays.asList(empArr);

        // To make the stream of arrays
        Stream<Employee> employeeStream = Arrays.stream(empArr);

        // To use the filter function of stream
       // List<Employee> employeeList1 = employeeStream.filter(x -> x.getName::toUpperCase()).collect(Collectors.toList());
        //out.println(employeeList1);
        //     Stream<Employee> employeeStream1 = Arrays.stream(empArr).filter(x -> x.getName().toUpperCase().contains()).collect(Collectors.toList());

        //   list.stream().filter(x -> x%2==0).forEach(x-> System.out.println(x));

        /*
         2. to print elements which starts with 1
         */
        /* list.stream()
                 .map(x -> x + "") // to convert Integer to String stream
                 .filter(x -> x.startsWith("1"))
                 .forEach(System.out::println);
         // for list of employees
         employeeStream.filter(x -> x.getName().startsWith("R")).forEach(x-> System.out.println(x.getName()));
*/
        //3. to find duplicate elements in array using streams
      /*  Set<Integer> set = new HashSet();
        list.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);*/

        //5. find first elemenent fromt the stream
        //  list.stream().findFirst().ifPresent(System.out::println);
        // employeeStream.findFirst().ifPresent(System.out::println);

        /**
         *    6.  To find the min/max elements from the streams
         */

        // list.stream().max(Integer::compare).ifPresent(System.out::println);
      /*  employeeStream.min((x,y)-> Double.compare(x.getSalary(),y.getSalary())).ifPresent(System.out::println);
        Optional<Employee> maxSalary =employeeStream.max((x, y) -> Double.compare(x.getSalary(),y.getSalary()));
        System.out.println(maxSalary);
        */

        /**
         * 7. print the elements in decending order
         *
         */
        // list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


        // To compare the elements of the Dto class
//        Arrays.stream(empArr).sorted(Comparator.comparing(Employee::getSalary)
//        ).forEach(emp -> System.out.println(emp));
        //Arrays.asList({new Employee(1,"kapil",20000)},);

        // To find the Max salary of the Employee
//        Optional<Employee> maxSalary = Arrays.stream(empArr).max(Comparator.comparing(Employee::getSalary));
//              System.out.println(maxSalary);
//        employeeStream.max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

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
