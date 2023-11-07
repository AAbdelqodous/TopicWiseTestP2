package q96;

import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;

public class Test {
    public static void main(String[] args) {
        LongFunction<LongUnaryOperator> func = a -> b -> b - a; //Line n1

        /* LongFunction<LongUnaryOperator> func = (a) -> {
            return (b) -> {
                return b - a;
            };
        }; */
        /* LongFunction<LongUnaryOperator> func = new LongFunction<LongUnaryOperator>() {
            @Override
            public LongUnaryOperator apply(long a) {
                LongUnaryOperator operator = new LongUnaryOperator() {
                    @Override
                    public long applyAsLong(long b) {
                        return b - a;
                    }
                };
                return operator;
            }
        };
        LongUnaryOperator operator = new LongUnaryOperator() {
            @Override
            public long applyAsLong(long b) {
                return b - 100;
            }
        }; */

        System.out.println(calc(func.apply(100), 50)); //Line n2
    }

    private static long calc(LongUnaryOperator op, long val) {
        return op.applyAsLong(val);
    }
}
