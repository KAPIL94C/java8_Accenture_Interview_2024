package MethodRefrence;

import dto.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 class RefStaticMethod {

/*
// static Methods for Method Refrence
    public static int compareById(Employee a, Employee b){
        return a.getId().compareTo(b.getId());

    }
    public static int compareByName(Employee a, Employee b){
        return  a.getName().compareTo(b.getName());
    }
*/

     //Instance Method for Method Refrence
     public  int compareById(Employee a, Employee b){
         return a.getId().compareTo(b.getId());

     }
     public  int compareByName(Employee a, Employee b){
         return  a.getName().compareTo(b.getName());
     }

    public static void main(String[] args) {
        List<Employee> EmployeeList = Arrays.asList(new Employee(1, "kapil", 20000),
                new Employee(4, "kritika", 30000),
                new Employee(3, "rajni", 50000));

        //   Type 1: Reference to a static method
     /*   // If a lambda expression just call a static method of a class
        (args) -> Class.staticMethod(args)
        Then method reference is like:
      // Shorthand if a lambda expression just call a static method of a class
        Class::staticMethod
        */

  /*      //Type I
       // Collections.sort(EmployeeList, RefStaticMethod::compareByName);
        //Type II
        EmployeeList.sort(RefStaticMethod::compareByName);
        System.out.println("Sort By Name");
        EmployeeList.stream().map(Employee::getName).forEach(System.out::println);

        Collections.sort(EmployeeList, RefStaticMethod::compareById);
        System.out.println("\nSort By Id");
        EmployeeList.stream().map(Employee::getName).forEach(System.out::println);
*/


       // Type 2: Reference to an instance method of a particular object
    /*    // If a lambda expression just call a default method of an object
        (args) -> obj.instanceMethod(args)
        Then method reference is like:
// Shorthand if a lambda expression just call a default method of an object
        obj::instanceMethod*/

      /*  RefStaticMethod RefObject = new RefStaticMethod();

        Collections.sort(EmployeeList, RefObject::compareById);
        System.out.println("Sort By Name");
        EmployeeList.stream().map(Employee::getName).forEach(System.out::println);
        Collections.sort(EmployeeList, RefObject::compareByName);
        System.out.println("\nSort By Id");
        EmployeeList.stream().map(Employee::getName).forEach(System.out::println);*/

        //Type 3: Reference to an instance method of an arbitrary object of a particular type

    /*    List<String> personList = new ArrayList<>();

        // Adding elements to above object of List
        // using add() method
        personList.add("vicky");
        personList.add("poonam");
        personList.add("sachin");
        // Method reference to String type
        Collections.sort(personList, String::compareToIgnoreCase);
        // Printing the elements(names) on console
        personList.forEach(System.out::println);*/

     //   Type 4: Constructor method reference
    }
}
