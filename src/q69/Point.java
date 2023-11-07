package q69;

public class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj){
        if (obj != null){
            return this.y == ((Point)obj).y + 1;
        }
        return false;
    }
}
