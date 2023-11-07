package q86;

import java.util.function.ToIntFunction;

public class Test {
    public static void main(String[] args) {
        String text = "Aa aA aB Ba aC Ca";
        ToIntFunction<String> func = text::indexOf; // search -> text.indexOf(search)
        System.out.println(func.applyAsInt("a"));
    }
}
