

public class Dodecagon implements Shape {
    private double side;

    // constructs a new circle with the given radius
    public Dodecagon(double side) {
        this.side = side;
    }

    private double getCircumradius() {
        return side / (2 * Math.sin(Math.PI / 12));
    }

    @Override
    public double getArea() {
        double circumradius = getCircumradius();
        return 6 * side * circumradius;
    }

   // Implementing the getPerimeter method for a Dodecagon
   public double getPerimeter() {
       return 12 * side;
   }




public static void main(String[] args) {

    System.out.println("e9q17");

    Dodecagon d1= new Dodecagon(2);
    System.out.println(d1.getArea());
    System.out.println(d1.getPerimeter());





}
}