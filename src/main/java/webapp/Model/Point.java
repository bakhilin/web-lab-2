package webapp.Model;

public class Point {
    private double X;
    private double Y;

    public Point(double X, double Y){
        this.X = X;
        this.Y = Y;
    }

    public  void setY(double y) {
        this.Y = y;
    }

    public  double getY() {
        return Y;
    }

    public  void setX(double x) {
        this.X = x;
    }

    public  double getX() {
        return X;
    }

    @Override
    public String toString() {
        return "Point{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}
