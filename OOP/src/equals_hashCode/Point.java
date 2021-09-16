package equals_hashCode;

import java.util.Objects;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Point point1 = new Point(3,4);
        Point point2 = new Point(3, 4);

        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode() == point2.hashCode() );
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode()); 
    }
}
