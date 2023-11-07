package q107;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        var books = List.of(
                new Book ("Head First Java", "Kathy Sierra", 19.5),
                new Book ("Java SE 11 Developer 1Z0-819 Practice Tests", "Udayan Khattry", 9.99),
                new Book ("Java - The Complete Reference", "Herbert Schildt", 14.0));

//        default void forEach(Consumer<? super T> action) {}
        books.forEach(b -> b.setPrice(b.getPrice() - 4)); // 3 Book instances are modifiable.
        books.forEach(System.out::println); //Line n2
//        books.forEach(b -> System.out.println(b)); //Line n2
    }
}
