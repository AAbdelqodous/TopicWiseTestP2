package q75;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoublePredicate;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Jack", 8000),
                new Employee("Lucy", 12000));
        updateSalary(employees, d -> d < 10000);
        employees.forEach(System.out::println);
    }

//    DoublePredicate : boolean test(double value);
//    IntPredicate : boolean test(int value);
//    LongPredicate : boolean test(long value);
    private static void updateSalary(List<Employee> list, DoublePredicate predicate) {
        for(Employee e : list) {
            if(predicate.negate().test(e.getSalary())) {
                e.setSalary(e.getSalary() + 2000);
            }
        }
    }
}
