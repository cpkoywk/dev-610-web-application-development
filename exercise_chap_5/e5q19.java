public class e5q19 {
    public static void main(String[] args) {
        System.out.println(firstDigit(-456));     
        System.out.println(firstDigit(0)); 
        System.out.println(firstDigit(3572));     
        System.out.println(firstDigit(-947));     

}

    public static int firstDigit(int n) {
    n = Math.abs(n);
     int sum = 0;
     while (n > 0) {
         int digit = n % 10;
         sum = digit;
         n = n/10;
     }
     return sum;    
    }
}