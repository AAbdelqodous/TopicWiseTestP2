package q23;

import q21.IOperation;

public class Test {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        IOperation iOperation = (var m, var n) -> m * n;
        System.out.println(iOperation.operate(5, 10));
    }
}
