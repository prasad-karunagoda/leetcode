package prasad.leetcode.datastructure;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return x + y;
    }

    @Override
    public boolean equals(Object otherPoint) {
        if (!(otherPoint instanceof Point)) {
            return false;
        }
        return this.x == ((Point) otherPoint).x && this.y == ((Point) otherPoint).y;
    }
}
