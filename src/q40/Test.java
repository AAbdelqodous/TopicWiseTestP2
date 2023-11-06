package q40;

public class Test {
    public static void main(String[] args) {
        DoubleToByte doubleToByte = Double.valueOf("123")::byteValue;
        System.out.println( doubleToByte.getValue());
    }
}
