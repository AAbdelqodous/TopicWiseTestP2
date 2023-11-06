package q54;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        check(Document::new);
        check(RFP::new);
    }

//    private static void check(Supplier<? extends Document> supplier) {
    private static void check(Supplier<Document> supplier) {
        supplier.get();
    }
}
