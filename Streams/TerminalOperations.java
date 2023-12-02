package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.SplittableRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

  /*      Terminal Stream operations:
    1.  forEach() :- that starts the internal iteration of the elements in
        the Stream and applies a Consumer (java.util.function.Consumer) to each
        element in the Stream. The forEach() method returns void.
        anyMatch()
        allMatch()
        noneMatch()
        collect()
        count()
        findAny()
        findFirst()
        min()
        max()
        reduce()
        toArray()*/
        List<String> stringList = new ArrayList<String>();

        stringList.add("Java Guides");
        stringList.add("Python Guides");
        stringList.add("C Guides");
        Stream<String> stream =stringList.stream();

       // forEach loop
        stream.forEach(e -> System.out.print(e+" "));


        //Collect Method
//        List<String> arrList = stream.map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(arrList);

        //  Reduce
     /*   Optional<String> reduced = stream.reduce((value, combinedValue) -> {
            return combinedValue + " + " + value;
        });
        System.out.println(reduced.get());*/

        //anyMatch() :-  return true if any one element of the stream matches with the given predicate.
      /* boolean anyMatch = stream.anyMatch(e ->e.startsWith("Java")
        );
       System.out.println(anyMatch);*/

        // allMatch():-  return true if all elements of the stream match with the given predicate.
       /* boolean anyMatch = stream.allMatch(e ->e.startsWith("Java")
        );
        System.out.println(anyMatch);
*/
        //noneMatch();  return true only if none elements of the stream does not match with the given predicate.
        /*boolean anyMatch = stream.noneMatch(e ->e.startsWith("Java")
        );
        System.out.println(anyMatch);*/
        
        // count() :- counts the elements.
       /* long countElements = stream.count();
        System.out.println(countElements);*/

        // findAny() Randomly returns any element from the stream;
/*        Optional<String> random =stream.findAny();
        System.out.println(random);*/

        //findFirst() returns the first element of the stream wrapped in an Optional Object.
        /*Optional<String> first =  stream.findFirst();
        System.out.println(first);*/
        
        //toArray 
//        stream.toArray();


    }
}
