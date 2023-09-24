

public class Hexagon implements Shape {
    private double side;

    // constructs a new circle with the given radius
    public Hexagon(double side) {
        this.side = side;
    }

    // returns the area of this circle
    public double getArea() {
        return side*side*3*Math.sqrt(3)/2;
    }

    // returns the perimeter of this circle
    public double getPerimeter() {
        return 6*side;
    }


      public boolean equals(Hexagon other) {


    return this.side==other.side;
}


public static void main(String[] args) {

    System.out.println("e9q16");

    Hexagon h1= new Hexagon(2);
    System.out.println(h1.getArea());
    System.out.println(h1.getPerimeter());





}
}