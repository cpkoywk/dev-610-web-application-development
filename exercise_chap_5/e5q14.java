public class e5q14 {
    public static void main(String[] args) {
        System.out.println(hasMidpoint(7,4,10));     
        System.out.println(hasMidpoint(9,15,8));     
}

    public static boolean hasMidpoint(int a, int b, int c) {
        // Sort the three numbers 
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        return ((b - a) ==  (c - b)) ;
    }
}