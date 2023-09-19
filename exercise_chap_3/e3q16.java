public class e3q16 {
    public static void main(String[] args) {
        triangleArea(8, 5.2, 7.1);
    }
    public static void triangleArea(double a,double b, double c) {
        double s=(a+b+c)/2;
        System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}

    