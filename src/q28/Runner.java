package q28;

public class Runner implements MyRunnable{
    public int run(Double s, Double e) {
        if(s == null) s = 0.0;
        if(e == null) e = 0.0;
        return (int) (s + e);
    }
}
