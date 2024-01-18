package Streams;

import dto.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        Employee[] empArr = {new Employee(1, "Kapil", 50000),
                new Employee(2, "Rajni", 10000),
                new Employee(3, "Kritika", 25000),
                new Employee(4, "Vipin", 12000),
                new Employee(5, "Renu", 22000),
                new Employee(6, "Boby", 30000)};

        List<Integer> intList = List.of(15, 20, 48, 63, 49, 27, 56, 32, 9);
        System.out.println("List of Elements:- " + intList);

        Stream<Employee> employeeStream = Arrays.stream(empArr);


        /**
         *   Intermediate Operations
         * 1.filter(predicate/condition) Method :-
         * 2.sorted() Method
         * 3.distinct() Method
         * 4. map() Method
         */


      /*  Method 1: filter(predicate) :-
      It returns a new stream consisting of the elements of the stream from which
       it is called which are according to the predicate (condition).
*/
     /*   System.out.println("\n List of filtered elements");
        intList.stream().filter(element -> element % 2 == 0)
                .forEach(element -> System.out.print(element + " "));
        List<Employee> employeeFilter = employeeStream.filter(x -> x.getName().startsWith("R")).collect(Collectors.toList());
*/

        /*
        Method 2: sorted()
        Returns a stream consisting of the elements of the stream passed,
        sorted according to the natural order.  If the elements of this stream
        are not comparable, a  java.lang.ClassCastException may be thrown when the
        terminal operation is executed.*/
        System.out.println("\n List of sorted elements");
        intList.stream().sorted().forEach(element -> System.out.print(element + " "));
      //  intList.stream().sorted(Collections.reverseOrder()).forEach(element -> System.out.print(element + " "));
        employeeStream.sorted((x, y) -> x.getId()).forEach(element -> System.out.print(element + " "));

        /*
        Method 3: Distinct()

         */
        System.out.println("To find the distinct element from the list");
        intList.stream().distinct().forEach(element -> System.out.print(element + " "));

/*
* Method 4: map()
Mapper is a non-interfering, stateless function to apply to each element of the stream.
  It returns a stream consisting of the results of applying the given function
  to the element of the passed stream.*/
        System.out.println("\n List of mapped elements");
        intList.stream().map(x -> x * x * x).forEach(element -> System.out.print(element + " "));
    //    List<String> collect = employeeStream.map(x -> x.getName().toUpperCase()).collect(Collectors.toList());
    }
}
