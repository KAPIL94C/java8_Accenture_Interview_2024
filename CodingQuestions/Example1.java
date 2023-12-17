package CodingQuestions;

public class Example1 {
    public static void main(String args[]) {
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;

        if (num1 == num2)
            System.out.println("num1 == num2");
        else
            System.out.println("num1 !== num2");


        if (num3 == num4)
            System.out.println("num3 == num4");
        else
            System.out.println("num3 !== num4");
    }
}
/*In Java, when you use the == operator with objects, it compares the references,
not the actual values. However, for Integer objects in a specific range (-128 to 127),
Java uses a cache for values within this range. This means that when you create an Integer object
 with a value within this range, the same reference is reused, making the == comparison true.*/
