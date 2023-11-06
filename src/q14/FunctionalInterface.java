package q14;

public class FunctionalInterface {
    public static void main(String[] args) {
        int i = 400;
        int finalI = i;
        IPrinter iPrinter = () -> System.out.println(finalI);
        iPrinter.print();
        System.out.println(++i);
    }
}
