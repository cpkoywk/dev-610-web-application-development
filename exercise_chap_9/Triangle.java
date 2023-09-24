// Represents triangular shapes.

import java.util.Arrays;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    // constructs a new triangle with the given side lengths
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // returns this triangle's area using Heron's formula
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // returns the perimeter of this triangle
    public double getPerimeter() {
        return a + b + c;
    }

public boolean equals(Triangle other) {
    double[] sorted1 = sortSides(this.a, this.b, this.c);
    double[] sorted2 = sortSides(other.a, other.b, other.c);

    return Arrays.equals(sorted1, sorted2);
}

private double[] sortSides(double a, double b, double c) {
    double[] sides = { a, b, c };
    Arrays.sort(sides);
    return sides;
}
public static void main(String[] args) {

    System.out.println("e9q14:");

    Triangle t1= new Triangle(1,3,2.5);
    Triangle t2= new Triangle(3,1,2.5);
    Triangle t3= new Triangle(1,3,3.5);
    System.out.println(t1.equals(t2));
    System.out.println(t1.equals(t3));

}
}