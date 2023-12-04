package LamdaExpression;


public class LExpressionParameter {
    interface Test1 {
        void print(String s);
    }
    public void operate(String s, Test1 test){
          test.print(s);

    }
    public static void main(String[] args) {
        //Example 1: Lambda expression with no parameters



        LExpressionParameter obj = new LExpressionParameter();
        Test1 test = (s)->System.out.println(s);

       obj.operate("hello", test);




    }
}
