package Streams;

import dto.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

  /*      Terminal Stream operations:
    1.  forEach() :- that starts the internal iteration of the elements in
        the Stream and applies a Consumer (java.util.function.Consumer) to each
        element in the Stream. The forEach() method returns void.
        2. collect()
        3. Match() -> anyMatch(), allMatch(), noneMatch()
        4. count()
        5. FindMethod() -> findAny(), findFirst()
        6. min(), max()
        reduce()
        toArray()*/
        List<String> stringList = new ArrayList<String>();
        stringList.add("Java Guides");
        stringList.add("Python Guides");
        stringList.add("C Guides");
        //Stream<String> stream = stringList.stream();

        Employee[] empArr = {new Employee(1, "Kapil", 50000), new Employee(2, "Rajni", 10000), new Employee(3, "Kritika", 25000), new Employee(4, "Vipin", 12000), new Employee(5, "Renu", 22000), new Employee(6, "Boby", 30000)};

        /**
         * 1. forEach method
         */
        stringList.stream().forEach(e -> System.out.print(e + " "));
        Arrays.asList(empArr).stream().forEach(employee -> System.out.println(employee + " "));


        /**
         * 2. Collect Method
         */

/*        List<String> arrList = stream.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(arrList);*/

        /*
          3. Match Method
          anyMatch() :-  return true if any one element of the stream matches with the given predicate.
          allMatch():-  return true if all elements of the stream match with the given predicate.
          noneMatch();  return true only if none elements of the stream does not match with the given predicate.
         */


     /*   boolean anyMatch = stringList.stream().anyMatch(e -> e.startsWith("Java"));
        System.out.println("Any Match :" + anyMatch);

        boolean allMatch = stringList.stream().allMatch(e -> e.startsWith("Java"));
        System.out.println("All Match :" + allMatch);

        boolean noneMatch = stringList.stream().noneMatch(e -> e.startsWith("Java"));
        System.out.println("None Match :" + noneMatch);

        boolean kapil = Arrays.asList(empArr).stream().anyMatch(employee -> employee.getName().startsWith("Kapil"));
        System.out.println(kapil);*/

        /**
         *  4. count() :- counts the elements.
         */
       /* long countElements = stream.count();
        System.out.println(countElements);*/

        /**
         * 5.Find Method
         *  findAny() Randomly returns any element from the stream;
         *  findFirst() returns the first element of the stream wrapped in an Optional Object.
          */

      /*  Optional<String> random =stringList.stream().findAny();
        System.out.println(random);

        Optional<String> first =  stringList.stream().findFirst();
        System.out.println(first);*/

        /**
         *  min()
         *  max()
         */

       /* //Method 1.
        System.out.println("Max salary");
        Arrays.asList(empArr).stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

        // Method 2.
        System.out.println("min salary");
        Arrays.asList(empArr).stream().min((x,y)-> Double.compare(x.getSalary(), y.getSalary())).ifPresent(System.out::println);*/

        /**
         * toArray
         */

        //Arrays.asList(empArr).stream().toArray();

        //  Reduce
     /*   Optional<String> reduced = stream.reduce((value, combinedValue) -> {
            return combinedValue + " + " + value;
        });
        System.out.println(reduced.get());*/







    }
}
