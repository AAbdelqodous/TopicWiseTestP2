package q103;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //  List.of() overloaded methods were added in Java 9 and these return an unmodifiable list containing passed elements.
        //  So, above list object referred by festivals is unmodifiable.
        var festivals = List.of("DIWALI", "CHRISTMAS", "EID");
        festivals.removeIf(str -> str.length() == 3);
        System.out.println(festivals);
    }
}
