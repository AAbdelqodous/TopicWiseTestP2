package q43;

public class Test {
    public static void main(String[] args) {
        MyInterface myInterface = Student::getMark;
        System.out.println(myInterface.getStudMark(new Student(1, "a", 10.0)));
    }
}
