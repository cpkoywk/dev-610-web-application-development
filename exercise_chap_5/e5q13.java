public class e5q13 {
    public static void main(String[] args) {
        consecutive(1, 2, 3);     
        consecutive(3, 2, 4);     
        consecutive(-10, -8, -9); 
        consecutive(3, 5, 7);    
        consecutive(1, 2, 2); }

    public static void consecutive(int a, int b, int c) {
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
        // Check if the  sorted numbers are consecutive.
        System.out.println(b - a == 1 && c - b == 1);
    }
}