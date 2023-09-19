public class e3q14 {
    public static void main(String[] args) {
        cylinderSurfaceArea(3.0, 4.5);
    }
    public static void cylinderSurfaceArea(double radius, double height) {

        System.out.println(2 * Math.PI* Math.pow(radius,2) + 2 * Math.PI*radius*height);
    }
}

    