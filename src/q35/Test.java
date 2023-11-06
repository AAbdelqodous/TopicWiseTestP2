package q35;

public class Test {
    public static void main(String[] args) {
        ICreator<Gift> iCreator = Gift::new;
        System.out.println(iCreator.create());
    }
}
