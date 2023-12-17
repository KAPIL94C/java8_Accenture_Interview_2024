package CodingQuestions;

class Base{
    public void print(){
        System.out.println("Base");
    };
}
class Derived extends Base {
    public void print(){
        System.out.println("Derived");
    };
}
public class Example2 {
    public static void DoPrint(Base o){
        o.print();
    }
    public static void main(String[] args) {
    Base x = new Base();
    Base y = new Derived();       // on base refrence object of derived
    Derived z = new Derived();    //on Derived refrence object of Derived
    DoPrint(x);
    DoPrint(y);
    DoPrint(z);

    }
}
