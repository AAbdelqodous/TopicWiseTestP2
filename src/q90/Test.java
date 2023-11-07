package q90;

import java.util.List;
import java.util.function.BinaryOperator;

public class Test {
    public static void main(String[] args) {
        // sorts the Strings in descending order of their lengths
        //returns the greater of two elements according to the specified Comparator.
        BinaryOperator<String> operator = BinaryOperator.maxBy((s1, s2) -> s2.length() - s1.length()); //Line n1
        var list = List.of(
                List.of("*", "****"),
                List.of("##", "#####"),
                List.of("$$$", "$$$$$$")); //Line n2
        for (var l : list){
            /* System.out.println(l);
            System.out.println(l.get(0).length());
            System.out.println(l.get(1).length()); */
            System.out.println(operator.apply(l.get(0), l.get(1)));
//            System.out.println("------------------------");
        }
    }
}
