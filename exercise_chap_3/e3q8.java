public class e3q8 {
    public static void main(String[] args) {
        quadratic(1,-7,12);
    }
    public static void quadratic(double a, double b, double c) {
       
        System.out.println(Math.abs( (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a)));
        System.out.println(Math.abs( (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a)));
}}

    