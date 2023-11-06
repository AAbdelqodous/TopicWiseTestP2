package q21;

public class Test {
    public static void main(String[] args) {
//        int x = 10;
//        int y = 20;
        IOperation iOperation = (x, y) -> x * y;
        System.out.println(iOperation.operate(5, 10));
    }
}
