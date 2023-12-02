package Streams;

import dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.*;


public class StreamsExa1 {
    public static void main(String[] args) {
         Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos",  100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };

         //Type #1
      //  Stream.of(arrayOfEmps);

      // Type #2
      List<Employee> empList  = asList(arrayOfEmps);
      empList.stream();

      //Different Java Stream Operations

      /*
      Intermediate Operations
       1.filter(predicate) Method
       2.sorted() Method
       3.distinct() Method
       4. map() Method*/
    }
}
