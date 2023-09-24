// Represents rectangular shapes.

import java.util.Arrays;

public class Rectangle implements Shape {
    private double width;
    private double height;

    // constructs a new rectangle with the given dimensions
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // returns the area of this rectangle
    public double getArea() {
        return width * height;
    }

    // returns the perimeter of this rectangle
    public double getPerimeter() {
        return 2.0 * (width + height);
    }


    public boolean equals(Rectangle other) {
    double[] sorted1 = sortSides(this.width, this.height);
    double[] sorted2 = sortSides(other.width, other.height);

    return Arrays.equals(sorted1, sorted2);
}

private double[] sortSides(double width, double height) {
    double[] sides = { width, height };
    Arrays.sort(sides);
    return sides;
}
public static void main(String[] args) {

    System.out.println("e9q14: Rectangle");

    Rectangle r1= new Rectangle(2,3);
    Rectangle r2= new Rectangle(3,2);
    Rectangle r3= new Rectangle(3,3);
    System.out.println(r1.equals(r2));
    System.out.println(r1.equals(r3));

}
}