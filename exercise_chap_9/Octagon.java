

public class Octagon implements Shape {
    private double side;

    // constructs a new circle with the given radius
    public Octagon(double side) {
        this.side = side;
    }

    // returns the area of this circle
    public double getArea() {
        return side*side*2*(1+Math.sqrt(2));
    }

    // returns the perimeter of this circle
    public double getPerimeter() {
        return 8*side;
    }


      public boolean equals(Octagon other) {


    return this.side==other.side;
}


public static void main(String[] args) {

    System.out.println("e9q15");

    Octagon o1= new Octagon(2);
    System.out.println(o1.getArea());
    System.out.println(o1.getPerimeter());





}
}