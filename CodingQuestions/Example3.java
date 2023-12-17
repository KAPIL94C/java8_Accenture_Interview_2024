package CodingQuestions;

import static java.lang.Boolean.FALSE;

public class Example3 {
    public static void main(String[] args) {

        System.out.println("TT "+isFalse(true,true));
        System.out.println("FF "+isFalse(false,false));

        System.out.println("TF "+isFalse(true,false));
        System.out.println("FT "+isFalse(false,true));
    }

    public static boolean isFalse(Boolean x,Boolean y){
        return FALSE.equals(x) || FALSE.equals(y);
    }
}
