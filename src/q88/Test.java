package q88;

import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        UnaryOperator<String> opr = s -> s.toString().toUpperCase();
//        opr.apply(new StringBuilder("Hello"));
        opr.apply(String.valueOf(new StringBuilder("Hello")));
    }
}
