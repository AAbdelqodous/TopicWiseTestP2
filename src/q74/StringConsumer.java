package q74;

import java.util.function.Consumer;

interface StringConsumer extends Consumer<String> {
    @Override
    default void accept(String s) {
        System.out.println(s.toUpperCase());
    }

}
