package LamdaExpression;

public class Example1 {

    // operation is implemented using lambda expressions
    interface FunctionInter1 {
        int operation(int a,int b);
    }

    // sayMessage() is implemented using lambda expressions
    interface FunctionInter2{
        void saySomething(String message);
    }
    // Performs FuncInter1's operation on 'a' and 'b'
    private  int operate(int a, int b, FunctionInter1 obj){
     return obj.operation(a,b);
    }

    public static void main(String[] args) {
       /* Lambda Expression Parameters
        There are three Lambda Expression Parameters are mentioned below:
        1. Zero Parameter
        2. Single Parameter
        3. Multiple Parameters
        */
     /*   FunctionInter1 multiply = (a,b)->a*b;
        FunctionInter1 add = (a,b)->a+b;
        Example1 obj = new Example1();

        System.out.println("Addition of two numbers "+obj.operate(2,3,add));
        System.out.println("Addition of two numbers "+obj.operate(2,3,multiply));

       FunctionInter2 Message = (text)-> System.out.println("Hello how are you"+text);

       Message.saySomething("hellow");*/




    }
}
