package by.ilya_budevich.model;

import java.awt.geom.Point2D;

public class Point extends Point2D {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() { return x; }
    @Override
    public double getY() { return y; }

    @Override
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public boolean equals(Point point) {
        return this.x == point.x && this.y == point.y;
    }
}
