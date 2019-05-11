import java.lang.reflect.Array;

public class MyCircle {
    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;

    public MyCircle() {

    }

    public MyCircle (int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return x;
    }

    public int setCenterX(int x) {
        this.x = x;
    }

    public int getCenterY() {
        return y;
    }

    public int setCenterY(int y) {
        this.y = y;
    }

    public int[] getCenterXY() {
        int[] xy = {x, y};
        return xy;
    }
    public void setCenterXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "MyCircle[radius="+radius+", center=("MyPoint.toString()+"]";
    }

    public double getArea() {

    }

    public double getCirumference() {

    }

    public double distance(MyCircle antoher) {

    }
}

