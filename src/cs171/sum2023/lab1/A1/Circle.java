// This class represents a circle shape
package cs171.sum2023.lab1.A1;

public class Circle {

    // Instance variables (data members) of class Circle
    protected double radius; // the radius of the circle
    protected double x; // the x coordinate of the circle's center
    protected double y; // the y coordinate fo the circle's center
    // The default constructor with no argument

    // TODO: constructor

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 0;

    }

    public Circle(double radius) {
        this.x = 0;
        this.y = 0;
        this.radius = radius;
    }

    public Circle(double radius, double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "Circle with radius " + this.radius + " at (" + this.x + ", " + this.y + ")";
    }

    public boolean equals(Circle other) {
        return this.radius == other.radius && this.x == other.x && this.y == other.y;
    }

    public boolean isLargerThan(Circle other) {
        return this.radius > other.radius;
    }

    public boolean isSmallerThan(Circle other) {
        return this.radius < other.radius;
    }

    public boolean isSameSizeAs(Circle other) {
        return this.radius == other.radius;
    }

    public boolean isSameSizeOrLargerThan(Circle other) {
        return this.radius >= other.radius;
    }

    public boolean isSameSizeOrSmallerThan(Circle other) {
        return this.radius <= other.radius;
    }

    public boolean isSameCenterAs(Circle other) {
        return this.x == other.x && this.y == other.y;
    }

    public boolean isSameCenterAs(Rectangle other) {
        return this.x == other.getX() && this.y == other.getY();
    }

    public boolean isSameCenterAs(double x, double y) {
        return this.x == x && this.y == y;
    }

    public boolean isLargerThan(Rectangle other) {
        return this.radius > other.getL() && this.radius > other.getH();
    }

    public boolean isSmallerThan(Rectangle other) {
        return this.radius < other.getL() && this.radius < other.getH();
    }

    public boolean isSameSizeAs(Rectangle other) {
        return this.radius == other.getL() && this.radius == other.getH();
    }

    public boolean isSameSizeOrLargerThan(Rectangle other) {
        return this.radius >= other.getL() && this.radius >= other.getH();
    }

    public boolean isSameSizeOrSmallerThan(Rectangle other) {
        return this.radius <= other.getL() && this.radius <= other.getH();
    }

    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) <= this.radius;
    }

    public boolean contains(Circle other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2)) + other.radius <= this.radius;
    }

    public boolean contains(Rectangle other) {
        return Math.sqrt(Math.pow(other.getX() - this.x, 2) + Math.pow(other.getY() - this.y, 2)) + Math.sqrt(Math.pow(other.getL(), 2) + Math.pow(other.getH(), 2)) <= this.radius;
    }

    public boolean overlaps(Circle other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2)) <= this.radius + other.radius;
    }

    public boolean overlaps(Rectangle other) {
        return Math.sqrt(Math.pow(other.getX() - this.x, 2) + Math.pow(other.getY() - this.y, 2)) <= this.radius + Math.sqrt(Math.pow(other.getL(), 2) + Math.pow(other.getH(), 2));
    }

    public boolean touches(Circle other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2)) == this.radius + other.radius;
    }

    public boolean touches(Rectangle other) {
        return Math.sqrt(Math.pow(other.getX() - this.x, 2) + Math.pow(other.getY() - this.y, 2)) == this.radius + Math.sqrt(Math.pow(other.getL(), 2) + Math.pow(other.getH(), 2));
    }

    public boolean touches(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) == this.radius;
    }

    public boolean touches(double x, double y, double radius) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) == this.radius + radius;
    }

    public boolean touches(double x, double y, double l, double h) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) == this.radius + Math.sqrt(Math.pow(l, 2) + Math.pow(h, 2));
    }

    public boolean touches(double x, double y, double l, double h, double radius) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) == this.radius + Math.sqrt(Math.pow(l, 2) + Math.pow(h, 2)) + radius;
    }

    public boolean touches(Circle other, double radius) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2)) == this.radius + other.radius + radius;
    }

    public boolean touches(Rectangle other, double radius) {
        return Math.sqrt(Math.pow(other.getX() - this.x, 2) + Math.pow(other.getY() - this.y, 2)) == this.radius + Math.sqrt(Math.pow(other.getL(), 2) + Math.pow(other.getH(), 2)) + radius;
    }

    public boolean touches(Circle other, double l, double h) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2)) == this.radius + other.radius + Math.sqrt(Math.pow(l, 2) + Math.pow(h, 2));
    }

    public boolean touches(Rectangle other, double l, double h) {
        return Math.sqrt(Math.pow(other.getX() - this.x, 2) + Math.pow(other.getY() - this.y, 2)) == this.radius + Math.sqrt(Math.pow(other.getL(), 2) + Math.pow(other.getH(), 2)) + Math.sqrt(Math.pow(l, 2) + Math.pow(h, 2));
    }

    public boolean touches(Circle other, double l, double h, double radius) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2)) == this.radius + other.radius + Math.sqrt(Math.pow(l, 2) + Math.pow(h, 2)) + radius;
    }


}
