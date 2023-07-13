// This class represents a rectangle shape
package cs171.sum2023.lab1.A1;

public class Rectangle {
    private double L; // the length of the rectangle
    private double H; // the height of the rectangle
    private double x; // the x coordinate of the bottom left corner of the rectangle
    private double y; // the y coordinate of the bottom left corner of the rectangle

    // constructor and getter and setter

    public Rectangle() {
        this.L = 0;
        this.H = 0;
        this.x = 0;
        this.y = 0;

    }

    public Rectangle(double L, double H) {
        this.L = L;
        this.H = H;
        this.x = 0;
        this.y = 0;

    }

    public Rectangle(double L, double H, double x, double y) {
        this.L = L;
        this.H = H;
        this.x = x;
        this.y = y;

    }

    public double getL() {
        return this.L;
    }

    public double getH() {
        return this.H;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }


    public void setL(double L) {
        this.L = L;
    }

    public void setH(double H) {
        this.H = H;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return this.L * this.H;
    }

    public double getPerimeter() {
        return 2 * (this.L + this.H);
    }

    public boolean contains(double x, double y) {
        return (x >= this.x && x <= this.x + this.L && y >= this.y && y <= this.y + this.H);
    }

    public boolean contains(Rectangle rectangle) {
        return (rectangle.x >= this.x && rectangle.x + rectangle.L <= this.x + this.L && rectangle.y >= this.y && rectangle.y + rectangle.H <= this.y + this.H);
    }

    public boolean overlaps(Rectangle rectangle) {
        return (rectangle.x + rectangle.L >= this.x && rectangle.x <= this.x + this.L && rectangle.y + rectangle.H >= this.y && rectangle.y <= this.y + this.H);
    }

    public String toString() {
        return "Rectangle: Length = " + this.L + ", Height = " + this.H + ", x = " + this.x + ", y = " + this.y;
    }

    public boolean equals(Rectangle other) {
        return this.L == other.L && this.H == other.H && this.x == other.x && this.y == other.y;
    }


}