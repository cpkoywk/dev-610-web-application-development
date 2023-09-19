public class e5q2 {
    public static void main(String[] args) {
        gcd(7,14);
        gcd(0,14);
    }
    public static void gcd(int a,int b) {
    while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
                ;
            }
        System.out.println(Math.abs(a));
            
    }
}