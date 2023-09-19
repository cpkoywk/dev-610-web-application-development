public class e5q3 {
    public static void main(String[] args) {
        printBinary(44);
    }
    public static void printBinary(int n) {
        while (n > 0) {
            int temp = n % 2; 
            System.out.print(temp); 
            n =n/2; 
        }
    }
}