package Streams;

import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {

        List<Integer> intList = List.of(15,20,48,63,49,27,56,32,9);
        System.out.println("List of Elements:- "+intList);

        /*
      Intermediate Operations
       1.filter(predicate/condition) Method :-
       2.sorted() Method
       3.distinct() Method
       4. map() Method*/

      /*  Method 1: filter(predicate) :-
      It returns a new stream consisting of the elements of the stream from which
       it is called which are according to the predicate (condition).
*/
        System.out.println("\n List of filtered elements");
        intList.stream().filter(element->element%2==0)
                .forEach(element->System.out.print(element+" "));
/*
        Method 2: sorted()
        Returns a stream consisting of the elements of the stream passed,
        sorted according to the natural order.  If the elements of this stream
        are not comparable, a  java.lang.ClassCastException may be thrown when the
        terminal operation is executed.*/
        System.out.println("\n List of sorted elements");
        intList.stream().sorted().forEach(element->System.out.print(element+" "));

/*
* Method 4: map()
Mapper is a non-interfering, stateless function to apply to each element of the stream.
  It returns a stream consisting of the results of applying the given function
  to the element of the passed stream.*/
        System.out.println("\n List of mapped elements");
        intList.stream().map(x -> x*x*x).forEach(element->System.out.print(element+" "));
    }
}
