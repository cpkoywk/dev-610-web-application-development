// Represents circular shapes.


public class Circle implements Shape {
    private double radius;

    // constructs a new circle with the given radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // returns the area of this circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // returns the perimeter of this circle
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }


      public boolean equals(Circle other) {


    return this.radius==other.radius;
}


public static void main(String[] args) {

    System.out.println("e9q14: Circle");

    Circle c1= new Circle(2);
    Circle c2= new Circle(3);
    Circle c3= new Circle(3);
    System.out.println(c1.equals(c2));
    System.out.println(c2.equals(c3));

}
}