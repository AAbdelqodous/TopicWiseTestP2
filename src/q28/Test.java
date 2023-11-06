package q28;

public class Test {
    public static void startRunning(MyRunnable r) {
        System.out.println(r.run(5.8, null)); //Line n1
    }

    public static void main(String[] args) {
//        startRunning(new Runner()); // success
        /* startRunning(new Runner() {
            public int run(Double d1, Double d2) {
                return (int)((d1 == null ? 0.0 : d1) + (d2 == null ? 0.0 : d2));
            }
        }); */
//        startRunning((a, b) ->(int) (a + b)); // fail
//        startRunning((a, b) -> a.byteValue()); // success
        startRunning((var d1, var d2) -> Double.valueOf(d1 + (d2 == null ? 0.0 : d2)).intValue());
    }
}
