package q31;

public class Test {
    private static String print(Number i, Number j, Number k) {
        return i + ", " + j + ", " + k;
    }

    public static void main(String[] args) {
        Logger obj = Test::print; //Line n1
        System.out.println(obj.log((byte)11, (byte)22, (byte)33)); //Line n2
    }
}
