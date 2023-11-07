package q97;

import java.util.function.Function;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
//        an ambiguous call and it matches to 2nd argument of both the overloaded methods.
//        System.out.println( create( new char[]{'o', 'u', 't'}, String::new).length()); //Line n1

        /* Function<char [], String> func = String::new;
        System.out.println( create( new char[]{'o', 'u', 't'}, func).length()); //Line n1 */
        /* Supplier<String> supp = String::new;
        System.out.println( create( new char[]{'o', 'u', 't'}, supp).length()); //Line n1 */

//        System.out.println(create(new char[]{'o', 'u', 't'}, c -> new String(c)).length());
//        System.out.println(create(new char[]{'o', 'u', 't'}, () -> new String()).length());

        System.out.println(create(new char[]{'o', 'u', 't'}, (Function<char [], String>)String::new).length());
        System.out.println(create(new char[]{'o', 'u', 't'}, (Supplier<String>)String::new).length());
    }

    private static String create(char [] c, Function<char[], String> func) { //Line n2
        return func.apply(c);
    }

    private static String create(char [] c, Supplier<String> supplier) { //Line n3
        return supplier.get();
    }
}
