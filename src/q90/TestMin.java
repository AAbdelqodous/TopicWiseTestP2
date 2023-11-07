package q90;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestMin {
    public static void main(String[] args) {
        // returns a BinaryOperator which returns the lesser of two elements according to the specified Comparator.
        BinaryOperator<List<String>> operator = BinaryOperator.minBy((s1, s2) -> s1.size() - s2.size()); //Line n1
        var list = List.of(
                List.of("CAPRE ", "DIEM ", "!"),
                List.of("BON ", "VOYAGE")); //Line n2
        operator.apply(list.get(0), list.get(1)).forEach(System.out::print); //Line n3
    }
}
