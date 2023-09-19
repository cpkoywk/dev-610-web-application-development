public class e5q15 {
    public static void main(String[] args) {
        System.out.println(dominant(7,4,10));     
        System.out.println(dominant(4,9,2));     
}

    public static boolean dominant(int a, int b, int c) {
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
        return (c>(a+b)) ;
    }
}