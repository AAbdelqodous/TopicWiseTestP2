package q87;

import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        final String password = "Oracle";
        UnaryOperator<String> opr1 = s -> s.replace('a','@'); //UnaryOperator<T> extends Function<T, T>
//        UnaryOperator<String> opr2 = password::concat;
        UnaryOperator<String> opr2 = s -> password.concat(s); //it is safe to invoke methods on final reference variable
        // but yes you can't assign another String object to final reference variable.
        System.out.println("Password: " + opr1.apply(opr2.apply("!")));
    }
}
